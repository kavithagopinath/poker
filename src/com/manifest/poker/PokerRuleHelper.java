package com.manifest.poker;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PokerRuleHelper {

	/**
	 * Gives the rank value based on the hand type from the map
	 * @return
	 */
	public static HashMap<String, Integer> getHandRanks() {

		HashMap<String, Integer> handRanks = new HashMap<String, Integer>();
		handRanks.put(HandType.HIGH_CARD.toString(), 1);
		handRanks.put(HandType.PAIR.toString(), 2);
		handRanks.put(HandType.TWO_PAIR.toString(), 3);
		handRanks.put(HandType.THREE_OF_A_KIND.toString(), 4);
		handRanks.put(HandType.STRAIGHT.toString(), 5);
		handRanks.put(HandType.FLUSH.toString(), 6);
		handRanks.put(HandType.FULL_HOUSE.toString(), 7);
		handRanks.put(HandType.FOUR_OF_A_KIND.toString(), 8);
		handRanks.put(HandType.STRAIGHT_FLUSH.toString(), 9);

		return handRanks;
	}

	/**
	 * method to check rank of two players
	 * 
	 * @param whiteHand
	 * @param blackHand
	 * @return result
	 */
	public String checkPokerHands(Card[] whiteHand, Card[] blackHand) {

		String result = "";
		HashMap<String, Integer> handRanks = getHandRanks();
		// Sorting in ascending order
		Arrays.sort(whiteHand);
		Arrays.sort(blackHand);
		
		HandType whiteHandType = getHandType(whiteHand);
		HandType blackHandType = getHandType(blackHand);
		System.out.println(whiteHandType.toString() + "\n" + blackHandType.toString());

		int playerOneRank = handRanks.get(whiteHandType.toString());
		int playerTwoRank = handRanks.get(blackHandType.toString());

		if (playerOneRank > playerTwoRank) {
			result = Constant.WHITE_WINS + whiteHandType.toString();

		} else if (playerOneRank < playerTwoRank) {
			result = Constant.BLACK_WINS + blackHandType.toString();
		} else {
			if (whiteHandType.toString().equals(HandType.HIGH_CARD.toString())) {
				result = getMaxRank(whiteHand, blackHand);

			} else if (whiteHandType.toString().equals(HandType.PAIR.toString())) {

				result = greatestOfTwoHands(whiteHand, blackHand, 2);

			} else if (whiteHandType.toString().equals(HandType.TWO_PAIR.toString())) {
				result = greatestOfTwoPair(whiteHand, blackHand);

			} else if (whiteHandType.toString().equals(HandType.THREE_OF_A_KIND.toString())) {

				result = greatestOfTwoHands(whiteHand, blackHand, 3);

			} else if (whiteHandType.toString().equals(HandType.STRAIGHT.toString())) {

				result = getMaxRank(whiteHand, blackHand);

			} else if (whiteHandType.toString().equals(HandType.FLUSH.toString())) {

				result = getMaxRank(whiteHand, blackHand);

			} else if (whiteHandType.toString().equals(HandType.FULL_HOUSE.toString())) {

				result = greatestOfTwoHands(whiteHand, blackHand, 3);

			} else if (whiteHandType.toString().equals(HandType.FOUR_OF_A_KIND.toString())) {

				result = greatestOfTwoHands(whiteHand, blackHand, 4);

			} else if (whiteHandType.toString().equals(HandType.STRAIGHT_FLUSH.toString())) {

				result = getMaxRank(whiteHand, blackHand);

			}
		}
		return result;
	}

	/**
	 * 
	 * @param white
	 * @param black
	 * @return
	 */
	private String getMaxRank(Card[] white, Card[] black) {
		for (int i = 0; i < 5; i++) {

			int maxOfHand1 = white[i].getRank();
			int maxOfHand2 = black[i].getRank();
			if (maxOfHand1 > maxOfHand2) {
				return Constant.WHITE_WINS;
			} else if (maxOfHand2 > maxOfHand1) {
				return Constant.BLACK_WINS;
			}
		}
		return Constant.TIE;
	}

	/**
	 * To find the hand type of the player
	 * @param hand
	 * @return hand type
	 */
	public HandType getHandType(Card[] hand) {

		if (checkAllCardHaveSameSuit(hand)) {

			if (checkAllCardIsInSequence(hand)) {
				return HandType.STRAIGHT_FLUSH;
			} else if (!checkAllCardIsInSequence(hand)) {
				return HandType.FLUSH;
			}
		}

		if (checkNumberOfSimilarCards(hand, 4, 0)) {
			return HandType.FOUR_OF_A_KIND;
		}

		if (checkNumberOfSimilarCards(hand, 3, 0) && checkNumberOfSimilarCards(hand, 2, 0)) {
			return HandType.FULL_HOUSE;
		}

		if (checkNumberOfSimilarCards(hand, 3, 0)) {
			return HandType.THREE_OF_A_KIND;
		}

		if (checkNumberOfSimilarCards(hand, 2, 2)) {
			return HandType.TWO_PAIR;
		}

		if (checkNumberOfSimilarCards(hand, 2, 1)) {
			return HandType.PAIR;
		}
		if (checkAllCardIsInSequence(hand)) {
			return HandType.STRAIGHT;
		}

		return HandType.HIGH_CARD;
	}

	/**
	 * Method to check if the all the values of cards are in sequence
	 * 
	 * @param hand
	 * @return boolean
	 */
	private boolean checkAllCardIsInSequence(Card[] hand) {
		int maxDiff = 1;
		Card temp = null;
		for (Card card : hand) {
			if (temp != null) {
				int diff = Math.abs(temp.getRank() - card.getRank());
				if (diff > maxDiff) {
					return false;
				}
			}
			temp = card;
		}
		return true;
	}

	/**
	 * checks if all the card in the hand are of same suit
	 * 
	 * @param hand
	 * @return boolean
	 */
	private boolean checkAllCardHaveSameSuit(Card[] hand) {
		Card temp = null;
		for (Card card : hand) {
			if (temp != null && !(temp.getSuit() == card.getSuit())) {
				return false;
			}
			temp = card;
		}
		return true;
	}

	/**
	 * Checks for card with similar rank in the hand
	 * @param hand
	 * @param number
	 * @param count
	 * @return boolean
	 */
	private boolean checkNumberOfSimilarCards(Card[] hand, int number, int count) {
		int pairCount = 0;
		Map<Integer, Integer> ranksMap = getCardRankCountMap(hand);
		for (Map.Entry<Integer, Integer> entry : ranksMap.entrySet()) {
			if ((entry.getValue() == number)) {
				if (count != 0) {
					pairCount = pairCount + 1;
					if (pairCount == count)
						return true;
				} else {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * To check the greatest of the similar cards if both 
	 * players have same type
	 * @param whiteHand
	 * @param blackHand
	 * @param number
	 * @return string
	 */
	private String greatestOfTwoHands(Card[] whiteHand, Card[] blackHand, int number) {
		Map<Integer, Integer> cardRankCountMap1 = getCardRankCountMap(whiteHand);
		Map<Integer, Integer> cardRankCountMap2 = getCardRankCountMap(blackHand);
		int maxWhite = getValueBasedOnNumber(cardRankCountMap1, number);
		int maxBlack = getValueBasedOnNumber(cardRankCountMap2, number);
		if (maxWhite > maxBlack) {
			return Constant.WHITE_WINS;
		} else if (maxBlack > maxWhite) {
			return Constant.BLACK_WINS;
		} else {
			return getMaxRank(whiteHand, blackHand);
		}
	}

	/**
	 * To get the key based on the passed value which is the number of occurrences of the card
	 * @param cardRankCountMap1
	 * @param number
	 * @return Integer
	 */
	private Integer getValueBasedOnNumber(Map<Integer, Integer> cardRankCountMap1, int number) {
		for (Map.Entry<Integer, Integer> entry : cardRankCountMap1.entrySet()) {

			if (entry.getValue() == number) {
				return entry.getKey();
			}

		}
		return 0;
	}

	/**
	 * To find the maximum of the given cardRankCount map
	 * @param cardRankCountMap1
	 * @param number
	 * @return integer
	 */
	private Integer getMaxValueBasedOnNumber(Map<Integer, Integer> cardRankCountMap1, int number) {
		int temp = 0;

		for (Map.Entry<Integer, Integer> entry : cardRankCountMap1.entrySet()) {

			if (temp == 0 && entry.getValue() == number) {
				temp = entry.getKey();
			} else if (entry.getValue() == number) {
				if (entry.getKey() > temp) {
					return entry.getKey();
				} else {
					return temp;
				}
			}

		}
		return 0;
	}
	/**
	 * To get the count of times same rank card is present in the hand
	 * @param hand
	 * @return map
	 */
	private Map<Integer, Integer> getCardRankCountMap(Card[] hand) {
		Map<Integer, Integer> ranksMap = new HashMap<Integer, Integer>();
		for (Card card : hand) {
			if (ranksMap.containsKey(card.getRank())) {
				int rank = card.getRank();
				int count = ranksMap.get(rank);
				ranksMap.put(rank, count + 1);
			} else {
				ranksMap.put(card.getRank(), 1);
			}

		}
		return ranksMap;
	}
	/**
	 * To get the greatest value of two pairs from one hand
	 * @param whiteHand
	 * @param blackHand
	 * @return
	 */
	private String greatestOfTwoPair(Card[] whiteHand, Card[] blackHand) {
		Map<Integer, Integer> cardRankCountMap1 = getCardRankCountMap(whiteHand);
		Map<Integer, Integer> cardRankCountMap2 = getCardRankCountMap(blackHand);
		int maxFirstWhite = getMaxValueBasedOnNumber(cardRankCountMap1, 2);
		int maxFirstBlack = getMaxValueBasedOnNumber(cardRankCountMap2, 2);
		if (maxFirstWhite > maxFirstBlack) {
			return Constant.WHITE_WINS;
		} else if (maxFirstBlack > maxFirstWhite) {
			return Constant.BLACK_WINS;
		} else {
			int maxWhite = getValueBasedOnNumber(cardRankCountMap1, 2, maxFirstWhite);
			int maxBlack = getValueBasedOnNumber(cardRankCountMap2, 2, maxFirstBlack);
			if (maxWhite > maxBlack) {
				return Constant.WHITE_WINS;
			} else if (maxBlack > maxWhite) {
				return Constant.BLACK_WINS;
			} else {
				int lastWhiteCard = getMaxValueBasedOnNumber(cardRankCountMap1, 1);
				int lastBlackCard = getMaxValueBasedOnNumber(cardRankCountMap2, 1);
				if (lastWhiteCard > lastBlackCard) {
					return Constant.WHITE_WINS;
				}

				else if (lastBlackCard > lastWhiteCard) {
					return Constant.BLACK_WINS;
				} else {
					return Constant.TIE;
				}

			}
		}
	}

	/**
	 * get next maximum value of pair if first pair becomes the same between two hands
	 * @param cardRankCountMap1
	 * @param number
	 * @param maxFirst
	 * @return int
	 */
	private int getValueBasedOnNumber(Map<Integer, Integer> cardRankCountMap1, int number, int maxFirst) {
		for (Map.Entry<Integer, Integer> entry : cardRankCountMap1.entrySet()) {

			if (entry.getValue() == number && entry.getKey() != maxFirst) {
				return entry.getKey();
			}

		}
		return 0;

	}

	
	

}
