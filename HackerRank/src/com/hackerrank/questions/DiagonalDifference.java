package com.hackerrank.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Given a square matrix, calculate the absolute difference between the sums of its diagonals.
 */

public class DiagonalDifference {
	
	public static int diagonalDiff(List<List<Integer>> matrixList) {
		
		int leftRightSum = 0;
		int rightLeftSum = 0;
		
		for(int i = 0; i < matrixList.size(); i++) {		
			leftRightSum += matrixList.get(i).get(i);			
		}
		
		int count = matrixList.size() - 1;
		
		for(int i = 0; i < matrixList.size(); i++) {
			rightLeftSum += matrixList.get(i).get(count--);
		}
		
		return Math.abs(leftRightSum - rightLeftSum);
	}

	public static void main(String[] args) {
		
		List<List<Integer>> arr = new ArrayList<List<Integer>>();
		List<List<Integer>> arrTwo = new ArrayList<List<Integer>>();
		
		arr.add(new ArrayList<Integer>(Arrays.asList(11, 2, 4)));
		arr.add(new ArrayList<Integer>(Arrays.asList(4, 5, 6)));
		arr.add(new ArrayList<Integer>(Arrays.asList(10, 8, -12)));
		
		arrTwo.add(new ArrayList<Integer>(Arrays.asList(1, 2, 3)));
		arrTwo.add(new ArrayList<Integer>(Arrays.asList(4, 5, 6)));
		arrTwo.add(new ArrayList<Integer>(Arrays.asList(9, 8, 9)));
		
		System.out.println("Difference: " + diagonalDiff(arr));
		System.out.println("Difference: " + diagonalDiff(arrTwo));

	}

}
