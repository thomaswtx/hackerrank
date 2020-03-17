package com.hackerrank.questions;

/*
 * You are in charge of the cake for your niece's birthday and have 
 * decided the cake will have one candle for each year of her total age. 
 * When she blows out the candles, she’ll only be able to blow out the 
 * tallest ones. Your task is to find out how many candles she can successfully blow out. 
 * For example, if your niece is turning 4 years old, and the cake will have 4 candles of 
 * height 4, 4, 1, 3, she will be able to blow out 2 candles successfully, since the tallest 
 * candles are of height 4 and there are 2 such candles.
 */

public class BirthdayCakeCandles {
	
	public static void candleCheck(int age, int[] candles) {
		
		int tallest = candles[0];
		int count = 0;
		
		for(int i = 1; i < candles.length; i++) {
			if(candles[i] > tallest) {
				tallest = candles[i];
			}
		}
		for(int i = 0; i < candles.length; i++) {
			if(candles[i] == tallest) {
				count++;
			}
		}
		System.out.println("count: " + count);
	}

	public static void main(String[] args) {
		
		int age = 4;
		int[] candles = {3, 2, 1, 3};
		
		candleCheck(age, candles);
		
		

	}

}
