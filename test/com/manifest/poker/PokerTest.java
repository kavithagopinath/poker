package com.manifest.poker;

import static org.junit.Assert.*;

import org.junit.Test;
public class PokerTest  {
	@Test
	public void both_highCard_black_Wins_with_Highest_card_Value() {
		
		PokerCardMaker pokerCardMaker=new PokerCardMaker();
		
		Card[] white = pokerCardMaker.makeHighCard1();
		
		
		Card[] black= pokerCardMaker.makeHighCard2();
		
		
		
		PokerRuleHelper pokerRuleHelper=new PokerRuleHelper();
		
		String result=pokerRuleHelper.checkPokerHands(white, black);
		
		assertEquals(Constant.BLACK_WINS, result);
	}
	@Test
	public void both_OnePair_White_wins_with_same_value_in_pair_and_high_value_not_in_pair()
	{
		PokerCardMaker pokerCardMaker=new PokerCardMaker();
		
		Card[] white = pokerCardMaker.makeOnePair1();
		
		
		Card[] black= pokerCardMaker.makeOnePair2();
		
		
		
		PokerRuleHelper pokerRuleHelper=new PokerRuleHelper();
		
		String result=pokerRuleHelper.checkPokerHands(white, black);
		
		assertEquals(Constant.WHITE_WINS, result);
	}
	@Test
	public void both_TwoPair_black_wins_with_one_pair_having_high_value()
	{
		PokerCardMaker pokerCardMaker=new PokerCardMaker();
		
		Card[] white = pokerCardMaker.makeTwoPair3();
		
		
		Card[] black= pokerCardMaker.makeTwoPair4();
		
		
		
		PokerRuleHelper pokerRuleHelper=new PokerRuleHelper();
		
		String result=pokerRuleHelper.checkPokerHands(white, black);
		
		assertEquals(Constant.BLACK_WINS, result);
	}
	@Test
	public void both_Three_Of_A_Kind_black_wins_with_higest_value_in_threes()
	{
		PokerCardMaker pokerCardMaker=new PokerCardMaker();
		
		Card[] white = pokerCardMaker.makeThreeOfKind1();
		
		
		Card[] black= pokerCardMaker.makeThreeOfKind2();
		
		
		
		PokerRuleHelper pokerRuleHelper=new PokerRuleHelper();
		
		String result=pokerRuleHelper.checkPokerHands(white, black);
		
		assertEquals( Constant.BLACK_WINS, result);
	}
	
	@Test
	public void both_Three_Of_A_Kind_Black_wins_With_High_Rank_On_Threes()
	{
		PokerCardMaker pokerCardMaker=new PokerCardMaker();
		
		Card[] white = pokerCardMaker.makeThreeOfKind1();
		
		
		Card[] black= pokerCardMaker.makeThreeOfKind2();
		
		
		
		PokerRuleHelper pokerRuleHelper=new PokerRuleHelper();
		
		String result=pokerRuleHelper.checkPokerHands(white, black);
		
		assertEquals(Constant.BLACK_WINS, result);
	}
	
	
	
	
	
	@Test
	public void both_Straight_black_wins_with_highest_value_in_the_sequence()
	{
		PokerCardMaker pokerCardMaker=new PokerCardMaker();
		
		Card[] white = pokerCardMaker.makeStraight1();
		
		
		Card[] black= pokerCardMaker.makeStraight2();
		
		
		
		PokerRuleHelper pokerRuleHelper=new PokerRuleHelper();
		
		String result=pokerRuleHelper.checkPokerHands(white, black);
		
		assertEquals(Constant.BLACK_WINS, result);		
	}
	@Test
	public void both_Flush_White_Wins_with_highest_card()
	{
		PokerCardMaker pokerCardMaker=new PokerCardMaker();
		
		Card[] white = pokerCardMaker.makeFlush1();
		
		
		Card[] black= pokerCardMaker.makeFlush2();
		
		
		
		PokerRuleHelper pokerRuleHelper=new PokerRuleHelper();
		
		String result=pokerRuleHelper.checkPokerHands(white, black);
		
		assertEquals( Constant.WHITE_WINS, result);
	}
	
	@Test
	public void both_Full_House_white_wins_with_highest_three_value()
	{
		PokerCardMaker pokerCardMaker=new PokerCardMaker();
		
		Card[] white = pokerCardMaker.makeFullHouse1();
		
		
		Card[] black= pokerCardMaker.makeFullHouse2();
		
		
		
		PokerRuleHelper pokerRuleHelper=new PokerRuleHelper();
		
		String result=pokerRuleHelper.checkPokerHands(white, black);
		
		assertEquals(Constant.WHITE_WINS, result);		
	}
	@Test
	public void both_Four_Of_A_Kind_black_wins_with_highest_in_four_value()
	{
		PokerCardMaker pokerCardMaker=new PokerCardMaker();
		
		Card[] white = pokerCardMaker.makeFourOfKind1();
		
		
		Card[] black= pokerCardMaker.makeFourOfKind2();
		
		
		
		PokerRuleHelper pokerRuleHelper=new PokerRuleHelper();
		
		String result=pokerRuleHelper.checkPokerHands(white, black);
		
		assertEquals(Constant.BLACK_WINS, result);		
	}
	
	
	@Test
	public void both_Full_house_with_highest_three_value()
	{
		PokerCardMaker pokerCardMaker=new PokerCardMaker();
		
		Card[] white = pokerCardMaker.makeFullHouse1();
		
		
		Card[] black= pokerCardMaker.makeFullHouse2();
		
		
		
		PokerRuleHelper pokerRuleHelper=new PokerRuleHelper();
		
		String result=pokerRuleHelper.checkPokerHands(white, black);
		
		assertEquals(Constant.WHITE_WINS, result);		
	}
	
	@Test
	public void high_Card_Vs_Straight_Flush()
	{
		PokerCardMaker pokerCardMaker=new PokerCardMaker();
		
		Card[] white = pokerCardMaker.makeHighCard2();
		
		
		Card[] black= pokerCardMaker.makeStraightFlush1();
		
		
		
		PokerRuleHelper pokerRuleHelper=new PokerRuleHelper();
		
		String result=pokerRuleHelper.checkPokerHands(white, black);
		
		assertEquals(Constant.BLACK_WINS+HandType.STRAIGHT_FLUSH, result);		
	}
	
	@Test
	public void One_Pair_Vs_Three_Of_A_Kind()
	{
		PokerCardMaker pokerCardMaker=new PokerCardMaker();
		
		Card[] white = pokerCardMaker.makeOnePair1();
		
		
		Card[] black= pokerCardMaker.makeThreeOfKind1();
		
		
		
		PokerRuleHelper pokerRuleHelper=new PokerRuleHelper();
		
		String result=pokerRuleHelper.checkPokerHands(white, black);
		
		assertEquals(Constant.BLACK_WINS+HandType.THREE_OF_A_KIND, result);	
	}
	
	@Test
	public void One_Pair_Vs_Four_Of_A_Kind()
	{
		PokerCardMaker pokerCardMaker=new PokerCardMaker();
		
		Card[] white = pokerCardMaker.makeFourOfKind1();
		
		
		Card[] black= pokerCardMaker.makeOnePair1();
		
		
		
		PokerRuleHelper pokerRuleHelper=new PokerRuleHelper();
		
		String result=pokerRuleHelper.checkPokerHands(white, black);
		
		assertEquals(Constant.WHITE_WINS+HandType.FOUR_OF_A_KIND, result);	
	}
	
	@Test
	public void Full_House_Vs_Four_Of_A_Kind()
	{
		PokerCardMaker pokerCardMaker=new PokerCardMaker();
		
		Card[] white = pokerCardMaker.makeFourOfKind1();
		
		
		Card[] black= pokerCardMaker.makeFullHouse1();
		
		
		
		PokerRuleHelper pokerRuleHelper=new PokerRuleHelper();
		
		String result=pokerRuleHelper.checkPokerHands(white, black);
		
		assertEquals(Constant.WHITE_WINS+HandType.FOUR_OF_A_KIND, result);	
	}
	
	@Test
	public void Two_Pair_Vs_Four_Of_A_Kind()
	{
		PokerCardMaker pokerCardMaker=new PokerCardMaker();
		
		Card[] white = pokerCardMaker.makeTwoPair3();
		
		
		Card[] black= pokerCardMaker.makeFourOfKind1();
		
		
		
		PokerRuleHelper pokerRuleHelper=new PokerRuleHelper();
		
		String result=pokerRuleHelper.checkPokerHands(white, black);
		
		assertEquals(Constant.BLACK_WINS+HandType.FOUR_OF_A_KIND, result);	
	}
	
	@Test
	public void Two_Pair_Vs_Straight()
	{
		PokerCardMaker pokerCardMaker=new PokerCardMaker();
		
		Card[] white = pokerCardMaker.makeTwoPair3();
		
		
		Card[] black= pokerCardMaker.makeStraight1();
		
		
		
		PokerRuleHelper pokerRuleHelper=new PokerRuleHelper();
		
		String result=pokerRuleHelper.checkPokerHands(white, black);
		
		assertEquals(Constant.BLACK_WINS+HandType.STRAIGHT, result);	
	}
	
	@Test
	public void Full_House_Vs_Three_Of_A_Kind()
	{
		PokerCardMaker pokerCardMaker=new PokerCardMaker();
		
		Card[] white = pokerCardMaker.makeFullHouse2();
		
		
		Card[] black= pokerCardMaker.makeThreeOfKind2();
		
		
		
		PokerRuleHelper pokerRuleHelper=new PokerRuleHelper();
		
		String result=pokerRuleHelper.checkPokerHands(white, black);
		
		assertEquals(Constant.WHITE_WINS+HandType.FULL_HOUSE, result);	
	}
	
	@Test
	public void Straight_Flush_Vs_Straight()
	{
		PokerCardMaker pokerCardMaker=new PokerCardMaker();
		
		Card[] white = pokerCardMaker.makeStraightFlush1();
		
		
		Card[] black= pokerCardMaker.makeStraight1();
		
		
		
		PokerRuleHelper pokerRuleHelper=new PokerRuleHelper();
		
		String result=pokerRuleHelper.checkPokerHands(white, black);
		
		assertEquals(Constant.WHITE_WINS+HandType.STRAIGHT_FLUSH, result);	
	}
	
	@Test
	public void FLUSH_Vs_HIGH_CARD()
	{
		PokerCardMaker pokerCardMaker=new PokerCardMaker();
		
		Card[] white = pokerCardMaker.makeFlush1();
		
		
		Card[] black= pokerCardMaker.makeHighCard1();
		
		
		
		PokerRuleHelper pokerRuleHelper=new PokerRuleHelper();
		
		String result=pokerRuleHelper.checkPokerHands(white, black);
		
		assertEquals(Constant.WHITE_WINS+HandType.FLUSH, result);	
	}
	
	@Test
	public void both_One_Pair_White_Wins_With_Hgher_Pair_Rank()
	{
		PokerCardMaker pokerCardMaker=new PokerCardMaker();
		
		Card[] white = pokerCardMaker.makeOnePair3();
		
		
		Card[] black= pokerCardMaker.makeOnePair4();
		
		
		
		PokerRuleHelper pokerRuleHelper=new PokerRuleHelper();
		
		String result=pokerRuleHelper.checkPokerHands(white, black);
		
		assertEquals(Constant.WHITE_WINS, result);	
	}
	
	@Test
	public void both_Two_Pair_White_Wins_With_Same_Higher_Pair_Rank()
	{
		PokerCardMaker pokerCardMaker=new PokerCardMaker();
		
		Card[] white = pokerCardMaker.makeTwoPair5();
		
		
		Card[] black= pokerCardMaker.makeTwoPair6();
		
		
		
		PokerRuleHelper pokerRuleHelper=new PokerRuleHelper();
		
		String result=pokerRuleHelper.checkPokerHands(white, black);
		
		assertEquals(Constant.WHITE_WINS, result);	
	}
	
	@Test
	public void both_Full_House_Black_WIns_With_higher_Twos_Card()
	{
		PokerCardMaker pokerCardMaker=new PokerCardMaker();
		
		Card[] white = pokerCardMaker.makeFullHouse3();
		
		
		Card[] black= pokerCardMaker.makeFullHouse4();
		
		
		
		PokerRuleHelper pokerRuleHelper=new PokerRuleHelper();
		
		String result=pokerRuleHelper.checkPokerHands(white, black);
		
		assertEquals(Constant.BLACK_WINS, result);	
	}
	
	@Test
	public void both_Four_Of_A_Kind_Black_WIns_On_Last_Card()
	{
		PokerCardMaker pokerCardMaker=new PokerCardMaker();
		
		Card[] white = pokerCardMaker.makeFullHouse3();
		
		
		Card[] black= pokerCardMaker.makeFullHouse4();
		
		
		
		PokerRuleHelper pokerRuleHelper=new PokerRuleHelper();
		
		String result=pokerRuleHelper.checkPokerHands(white, black);
		
		assertEquals(Constant.BLACK_WINS, result);	
	}
	@Test
	public void both_Stright_Flush_Tie()
	{
		PokerCardMaker pokerCardMaker=new PokerCardMaker();
		
		Card[] white = pokerCardMaker.makeStraightFlush3();
		
		
		Card[] black= pokerCardMaker.makeStraightFlush4();
		
		
		
		PokerRuleHelper pokerRuleHelper=new PokerRuleHelper();
		
		String result=pokerRuleHelper.checkPokerHands(white, black);
		
		assertEquals(Constant.TIE, result);	
	}
	@Test
	public void both_Three_Of_A_Kind_Same_Threes_Black_Wins_On_Next_Highest_card()
	{
		PokerCardMaker pokerCardMaker=new PokerCardMaker();
		
		Card[] white = pokerCardMaker.makeStraightFlush3();
		
		
		Card[] black= pokerCardMaker.makeStraightFlush4();
		
		
		
		PokerRuleHelper pokerRuleHelper=new PokerRuleHelper();
		
		String result=pokerRuleHelper.checkPokerHands(white, black);
		
		assertEquals(Constant.TIE, result);	
	}
	
	
}
