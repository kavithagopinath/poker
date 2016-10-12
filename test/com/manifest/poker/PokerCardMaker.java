package com.manifest.poker;

public class PokerCardMaker {
	private static Card[] makeHand() {
		Card[] hand1 = new Card[5];
		int counter = 0;
		for (int i=1; i<= 5; i++) {
			Card card= new Card();
			
			hand1[counter]=card; 
			counter++;
		}
		return hand1;
	}

	public Card[] makeOnePair1() {

		Card[] hand = makeHand();
		hand[0].setRank(13);
		hand[1].setRank(13);
		hand[2].setRank(1);
		hand[3].setRank(7);
		hand[4].setRank(9);

		hand[0].setSuit(2);
		hand[1].setSuit(1);
		hand[2].setSuit(3);
		hand[3].setSuit(3);
		hand[4].setSuit(1);
		return hand;
	}
	public Card[] makeOnePair2() {

		Card[] hand = makeHand();
		hand[0].setRank(13);
		hand[1].setRank(13);
		hand[2].setRank(1);
		hand[3].setRank(7);
		hand[4].setRank(4);

		hand[0].setSuit(2);
		hand[1].setSuit(1);
		hand[2].setSuit(3);
		hand[3].setSuit(3);
		hand[4].setSuit(1);
		return hand;
	}
	public Card[] makeOnePair3() {

		Card[] hand = makeHand();
		hand[0].setRank(13);
		hand[1].setRank(13);
		hand[2].setRank(1);
		hand[3].setRank(7);
		hand[4].setRank(4);

		hand[0].setSuit(2);
		hand[1].setSuit(1);
		hand[2].setSuit(3);
		hand[3].setSuit(3);
		hand[4].setSuit(1);
		return hand;
	}
	public Card[] makeOnePair4() {

		Card[] hand = makeHand();
		hand[0].setRank(11);
		hand[1].setRank(13);
		hand[2].setRank(7);
		hand[3].setRank(7);
		hand[4].setRank(4);

		hand[0].setSuit(2);
		hand[1].setSuit(1);
		hand[2].setSuit(3);
		hand[3].setSuit(3);
		hand[4].setSuit(1);
		return hand;
	}
	
	public Card[] makeTwoPair1() {
		Card[] hand = makeHand();
		hand[0].setRank(1);
		hand[1].setRank(1);
		hand[2].setRank(3);
		hand[3].setRank(3);
		hand[4].setRank(8);

		hand[0].setSuit(3);
		hand[1].setSuit(1);
		hand[2].setSuit(4);
		hand[3].setSuit(2);
		hand[4].setSuit(1);
		return hand;
	}
	public Card[] makeTwoPair2() {
		Card[] hand = makeHand();
		hand[0].setRank(1);
		hand[1].setRank(1);
		hand[2].setRank(6);
		hand[3].setRank(6);
		hand[4].setRank(4);

		hand[0].setSuit(3);
		hand[1].setSuit(1);
		hand[2].setSuit(4);
		hand[3].setSuit(2);
		hand[4].setSuit(1);
		return hand;
	}
	public Card[] makeTwoPair3() {
		Card[] hand = makeHand();
		hand[0].setRank(4);
		hand[1].setRank(4);
		hand[2].setRank(3);
		hand[3].setRank(8);
		hand[4].setRank(8);

		hand[0].setSuit(3);
		hand[1].setSuit(1);
		hand[2].setSuit(4);
		hand[3].setSuit(2);
		hand[4].setSuit(1);
		return hand;
	}
	public Card[] makeTwoPair4() {
		Card[] hand = makeHand();
		hand[0].setRank(8);
		hand[1].setRank(8);
		hand[2].setRank(9);
		hand[3].setRank(9);
		hand[4].setRank(4);

		hand[0].setSuit(3);
		hand[1].setSuit(1);
		hand[2].setSuit(4);
		hand[3].setSuit(2);
		hand[4].setSuit(1);
		return hand;
	}
	public Card[] makeTwoPair5() {
		Card[] hand = makeHand();
		hand[0].setRank(5);
		hand[1].setRank(5);
		hand[2].setRank(6);
		hand[3].setRank(6);
		hand[4].setRank(8);

		hand[0].setSuit(3);
		hand[1].setSuit(1);
		hand[2].setSuit(4);
		hand[3].setSuit(2);
		hand[4].setSuit(1);
		return hand;
	}
	public Card[] makeTwoPair6() {
		Card[] hand = makeHand();
		hand[0].setRank(1);
		hand[1].setRank(1);
		hand[2].setRank(6);
		hand[3].setRank(6);
		hand[4].setRank(4);

		hand[0].setSuit(3);
		hand[1].setSuit(1);
		hand[2].setSuit(4);
		hand[3].setSuit(2);
		hand[4].setSuit(1);
		return hand;
	}

	public Card[] makeThreeOfKind1() {
		Card[] hand = makeHand();
		hand[0].setRank(7);
		hand[1].setRank(7);
		hand[2].setRank(7);
		hand[3].setRank(1);
		hand[4].setRank(9);

		hand[0].setSuit(1);
		hand[1].setSuit(2);
		hand[2].setSuit(4);
		hand[3].setSuit(2);
		hand[4].setSuit(2);
		return hand;
	}
	
	public Card[] makeThreeOfKind2() {
		Card[] hand = makeHand();
		hand[0].setRank(8);
		hand[1].setRank(8);
		hand[2].setRank(8);
		hand[3].setRank(1);
		hand[4].setRank(3);

		hand[0].setSuit(1);
		hand[1].setSuit(2);
		hand[2].setSuit(4);
		hand[3].setSuit(2);
		hand[4].setSuit(2);
		return hand;
	}
	public Card[] makeThreeOfKind3() {
		Card[] hand = makeHand();
		hand[0].setRank(7);
		hand[1].setRank(7);
		hand[2].setRank(7);
		hand[3].setRank(1);
		hand[4].setRank(9);

		hand[0].setSuit(1);
		hand[1].setSuit(2);
		hand[2].setSuit(4);
		hand[3].setSuit(2);
		hand[4].setSuit(2);
		return hand;
	}
	public Card[] makeThreeOfKind4() {
		Card[] hand = makeHand();
		hand[0].setRank(7);
		hand[1].setRank(7);
		hand[2].setRank(7);
		hand[3].setRank(11);
		hand[4].setRank(9);

		hand[0].setSuit(1);
		hand[1].setSuit(2);
		hand[2].setSuit(4);
		hand[3].setSuit(2);
		hand[4].setSuit(2);
		return hand;
	}
	public Card[] makeFourOfKind1() {
		Card[] hand = makeHand();
		hand[0].setRank(10);
		hand[1].setRank(10);
		hand[2].setRank(10);
		hand[3].setRank(10);
		hand[4].setRank(4);

		hand[0].setSuit(2);
		hand[1].setSuit(1);
		hand[2].setSuit(3);
		hand[3].setSuit(3);
		hand[4].setSuit(1);
		return hand;
	}
	public Card[] makeFourOfKind2() {
		Card[] hand = makeHand();
		hand[0].setRank(14);
		hand[1].setRank(14);
		hand[2].setRank(14);
		hand[3].setRank(14);
		hand[4].setRank(4);

		hand[0].setSuit(2);
		hand[1].setSuit(1);
		hand[2].setSuit(3);
		hand[3].setSuit(3);
		hand[4].setSuit(1);
		return hand;
	}
	public Card[] makeFourOfKind3() {
		Card[] hand = makeHand();
		hand[0].setRank(10);
		hand[1].setRank(10);
		hand[2].setRank(10);
		hand[3].setRank(10);
		hand[4].setRank(4);

		hand[0].setSuit(2);
		hand[1].setSuit(1);
		hand[2].setSuit(3);
		hand[3].setSuit(3);
		hand[4].setSuit(1);
		return hand;
	}
	public Card[] makeFourOfKind4() {
		Card[] hand = makeHand();
		hand[0].setRank(10);
		hand[1].setRank(10);
		hand[2].setRank(10);
		hand[3].setRank(10);
		hand[4].setRank(9);

		hand[0].setSuit(2);
		hand[1].setSuit(1);
		hand[2].setSuit(3);
		hand[3].setSuit(3);
		hand[4].setSuit(1);
		return hand;
	}

	public Card[] makeFullHouse1() {
		Card[] hand = makeHand();
		hand[0].setRank(13);
		hand[1].setRank(13);
		hand[2].setRank(13);
		hand[3].setRank(5);
		hand[4].setRank(5);

		hand[0].setSuit(2);
		hand[1].setSuit(1);
		hand[2].setSuit(3);
		hand[3].setSuit(3);
		hand[4].setSuit(1);
		return hand;
	}
	public Card[] makeFullHouse2() {
		Card[] hand = makeHand();
		hand[0].setRank(10);
		hand[1].setRank(10);
		hand[2].setRank(10);
		hand[3].setRank(4);
		hand[4].setRank(4);

		hand[0].setSuit(2);
		hand[1].setSuit(1);
		hand[2].setSuit(3);
		hand[3].setSuit(3);
		hand[4].setSuit(1);
		return hand;
	}
	public Card[] makeFullHouse3() {
		Card[] hand = makeHand();
		hand[0].setRank(10);
		hand[1].setRank(10);
		hand[2].setRank(10);
		hand[3].setRank(5);
		hand[4].setRank(5);

		hand[0].setSuit(2);
		hand[1].setSuit(1);
		hand[2].setSuit(3);
		hand[3].setSuit(3);
		hand[4].setSuit(1);
		return hand;
	}
	public Card[] makeFullHouse4() {
		Card[] hand = makeHand();
		hand[0].setRank(10);
		hand[1].setRank(10);
		hand[2].setRank(10);
		hand[3].setRank(7);
		hand[4].setRank(7);

		hand[0].setSuit(2);
		hand[1].setSuit(1);
		hand[2].setSuit(3);
		hand[3].setSuit(3);
		hand[4].setSuit(1);
		return hand;
	}

	public Card[] makeFlush1() {
		Card[] hand = makeHand();
		hand[0].setRank(13);
		hand[1].setRank(12);
		hand[2].setRank(1);
		hand[3].setRank(7);
		hand[4].setRank(4);

		hand[0].setSuit(1);
		hand[1].setSuit(1);
		hand[2].setSuit(1);
		hand[3].setSuit(1);
		hand[4].setSuit(1);
		return hand;
	}
	public Card[] makeFlush2() {
		Card[] hand = makeHand();
		hand[0].setRank(11);
		hand[1].setRank(12);
		hand[2].setRank(1);
		hand[3].setRank(7);
		hand[4].setRank(4);

		hand[0].setSuit(1);
		hand[1].setSuit(1);
		hand[2].setSuit(1);
		hand[3].setSuit(1);
		hand[4].setSuit(1);
		return hand;
	}
	public Card[] makeStraightFlush1() {
		Card[] hand = makeHand();
		hand[0].setRank(5);
		hand[1].setRank(6);
		hand[2].setRank(7);
		hand[3].setRank(8);
		hand[4].setRank(9);

		hand[0].setSuit(2);
		hand[1].setSuit(2);
		hand[2].setSuit(2);
		hand[3].setSuit(2);
		hand[4].setSuit(2);
		return hand;
	}

	public Card[] makeStraightFlush2() {
		Card[] hand = makeHand();
		hand[0].setRank(7);
		hand[1].setRank(8);
		hand[2].setRank(9);
		hand[3].setRank(10);
		hand[4].setRank(11);

		hand[0].setSuit(4);
		hand[1].setSuit(4);
		hand[2].setSuit(4);
		hand[3].setSuit(4);
		hand[4].setSuit(4);
		return hand;
	}
	public Card[] makeStraightFlush3() {
		Card[] hand = makeHand();
		hand[0].setRank(7);
		hand[1].setRank(8);
		hand[2].setRank(9);
		hand[3].setRank(10);
		hand[4].setRank(11);

		hand[0].setSuit(4);
		hand[1].setSuit(4);
		hand[2].setSuit(4);
		hand[3].setSuit(4);
		hand[4].setSuit(4);
		return hand;
	}
	public Card[] makeStraightFlush4() {
		Card[] hand = makeHand();
		hand[0].setRank(7);
		hand[1].setRank(8);
		hand[2].setRank(9);
		hand[3].setRank(10);
		hand[4].setRank(11);

		hand[0].setSuit(4);
		hand[1].setSuit(4);
		hand[2].setSuit(4);
		hand[3].setSuit(4);
		hand[4].setSuit(4);
		return hand;
	}
	public Card[] makeRoyalFlush() {
		Card[] hand = makeHand();
		hand[0].setRank(1);
		hand[1].setRank(11);
		hand[2].setRank(12);
		hand[3].setRank(13);
		hand[4].setRank(10);

		hand[0].setSuit(1);
		hand[1].setSuit(1);
		hand[2].setSuit(1);
		hand[3].setSuit(1);
		hand[4].setSuit(1);
		return hand;
	}

	public Card[] makeStraight1() {
		Card[] hand = makeHand();
		hand[0].setRank(4);
		hand[1].setRank(5);
		hand[2].setRank(6);
		hand[3].setRank(7);
		hand[4].setRank(8);

		hand[0].setSuit(2);
		hand[1].setSuit(1);
		hand[2].setSuit(4);
		hand[3].setSuit(3);
		hand[4].setSuit(1);
		return hand;
	}
	public Card[] makeStraight2() {
		Card[] hand = makeHand();
		hand[0].setRank(7);
		hand[1].setRank(8);
		hand[2].setRank(9);
		hand[3].setRank(10);
		hand[4].setRank(11);

		hand[0].setSuit(2);
		hand[1].setSuit(2);
		hand[2].setSuit(3);
		hand[3].setSuit(4);
		hand[4].setSuit(1);
		return hand;
	}
	public Card[] makeHighCard1() {
		Card[] hand = makeHand();
		hand[0].setRank(13);
		hand[1].setRank(10);
		hand[2].setRank(1);
		hand[3].setRank(7);
		hand[4].setRank(4);

		hand[0].setSuit(2);
		hand[1].setSuit(1);
		hand[2].setSuit(3);
		hand[3].setSuit(4);
		hand[4].setSuit(1);
		return hand;

	}

	public Card[] makeHighCard2() {
		Card[] hand = makeHand();
		hand[0].setRank(13);
		hand[1].setRank(10);
		hand[2].setRank(1);
		hand[3].setRank(7);
		hand[4].setRank(9);

		hand[0].setSuit(2);
		hand[1].setSuit(1);
		hand[2].setSuit(3);
		hand[3].setSuit(4);
		hand[4].setSuit(1);
		return hand;

	}

}
