package com.manifest.poker;


public class Card implements Comparable<Card>
{
	private Integer suit;
	private Integer rank;
	
	

	@Override
	public int compareTo(Card o) 
	{
		return rank.compareTo(o.getRank());
		
	     /*if (this.rank == (o.rank))
	            return 0;
	     else if ((this.rank) > (o.rank))
	            return 1;
	     else
	           return -1;*/
	}
	

	public Integer getSuit() {
		return suit;
	}


	public void setSuit(Integer suit) {
		this.suit = suit;
	}


	public Integer getRank() {
		return rank;
	}


	@Override
	public String toString() {
		return "Card [suit=" + suit + ", rank=" + rank + "]";
	}


	public void setRank(Integer rank) {
		this.rank = rank;
	}

}