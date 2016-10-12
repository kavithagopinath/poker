package com.manifest.poker;

import java.util.Scanner;


public class GameMain 
{

	
  public static void main(String[] args) 
	{
	  int playersCount=2;
	  int handSize=5;
		Card[] black = new Card[5];
		Card[] white = new Card[5];

	  for(int i=0;i<playersCount;i++)
	  {
		  if(i==0)
			  System.out.println("Enter cards for White player");
		  else
			  System.out.println("Enter cards for Black player");
		  for(int j=0;j<handSize;j++)
		  {
			  

				Scanner scanner = new Scanner(System. in);
				 String input = scanner.nextLine();
				 
				 Card card=new Card();
				 String rank=input.substring(0, 1);
				 String suit=input.substring(1,2);
				 if(i==0)
				 {
					 white[j]=card;
					 white[j].setRank(getCardValueForInputString(rank));
					 white[j].setSuit(getCardValueForInputString(suit));
					
				 }
				 else
				 {
					 black[j]=card;
					 black[j].setRank(getCardValueForInputString(rank));
					 black[j].setSuit(getCardValueForInputString(suit));
				 }
	  }
	  
		
	  }
		
		
		PokerRuleHelper pokerRuleHelper=new PokerRuleHelper();
		
		@SuppressWarnings("static-access")
		String result=pokerRuleHelper.checkPokerHands(white, black);
		
		System.out.println("******************"+result+"*********************");
	}
  public static int getCardValueForInputString(String input)
  {
	if(input.equalsIgnoreCase("A"))
	  return Constant.A;
	else if(input.equalsIgnoreCase("J"))
		return Constant.J;
	else if(input.equalsIgnoreCase("Q"))
		return Constant.Q;
	else if(input.equalsIgnoreCase("K"))
		return Constant.K;
	else if(input.equalsIgnoreCase("T"))
		return Constant.T;
	else if(input.equalsIgnoreCase("C"))
		return Constant.C;
	else if(input.equalsIgnoreCase("D"))
		return Constant.D;
	else if(input.equalsIgnoreCase("H"))
		return Constant.H;
	else if(input.equalsIgnoreCase("S"))
		return Constant.S;
	else
		return Integer.parseInt(input);
  }
	
}

