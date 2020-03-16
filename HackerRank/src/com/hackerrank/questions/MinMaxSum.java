package com.hackerrank.questions;

import java.util.Arrays;

/*
 * Given five positive integers, find the minimum and maximum 
 * values that can be calculated by summing exactly four of the 
 * five integers.Then print the respective minimum and maximum 
 * values as a single line of two space-separated long integers.
 * 
 */

public class MinMaxSum {
	
	public static void minMaxSum(int[] arr) {
		
		Arrays.sort(arr);
		
		long minSum = 0;
		long maxSum = 0;
		
		for(int i = 0; i < arr.length - 1; i++) {
			minSum += arr[i];
		}
		
		for(int i = 1; i < arr.length; i++) {
			maxSum += arr[i];
		}
		
		System.out.println(minSum + " " + maxSum);
		
	}

	public static void main(String[] args) {
		
		int[] arr = {1, 3, 5, 7, 9};
		
		minMaxSum(arr);


	}

}
