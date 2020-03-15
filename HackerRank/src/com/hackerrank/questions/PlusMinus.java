package com.hackerrank.questions;

/*
 * Given an array of integers, calculate the fractions of its elements that are positive, 
 * negative, and are zeros. Print the decimal value of each fraction on a new line.
 * 
 */

public class PlusMinus {
	
	public static void plusMinus(int[] arr) {
		
		double posRatio = 0.0;
		double negRatio = 0.0;
		double zeroRatio = 0.0;
		
		int size = arr.length;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > 0) {
				posRatio += 1.0;
			} else if(arr[i] < 0) {
				negRatio += 1.0;
			} else {
				zeroRatio += 1.0;
			}
		}
		
		System.out.println("Positive: ");
		System.out.printf("%.6f", (posRatio / size));
		System.out.println("\nNegative: ");
		System.out.printf("%.6f", (negRatio / size));
		System.out.println("\nZero: ");
		System.out.printf("%.6f", (zeroRatio / size));
	}

	public static void main(String[] args) {
		
		int[] arr = {-4, 3, -9, 0, 4, 1};
		int[] arrTwo = {-1, 3, -2, 0, 8, 0, 1, 5, 7};
		int[] arrThree = {8, 1, -3, 0, 0, 0, -2, -5, 5, 6};
		
		System.out.println("---First---");
		plusMinus(arr);
		System.out.println();
		System.out.println("---Second---");
		plusMinus(arrTwo);
		System.out.println();
		System.out.println("---Third---");
		plusMinus(arrThree);

	}

}
