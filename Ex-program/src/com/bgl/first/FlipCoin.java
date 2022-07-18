package com.bgl.first;
import java.util.Random;
public class FlipCoin {

		private enum Coin{Heads, Tails};
		Random randomNum = new Random();
		private int result;
		//private int heads = 0;
		//private int tails = 1;
		Coin coinFlip;

		public void flip()
		{
			result = randomNum.nextInt(2);

			if(result == 0)
			{
			   coinFlip = Coin.Heads;
			   System.out.println("You flipped Heads!");
			}
			else
			{
			   coinFlip = Coin.Tails;
			   System.out.println("You flipped Tails!");
			}
		}
	
public static void main(String[] args) {
	FlipCoin fc=new FlipCoin();
	fc.flip();
}
}