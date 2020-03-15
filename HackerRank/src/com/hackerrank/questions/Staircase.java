package com.hackerrank.questions;

/*
 * Observe that its base and height are both equal to n, 
 * and the image is drawn using the # symbol and spaces. 
 * The last line is not preceded by any spaces. 
 * Write a program that prints a staircase of size n.
 */

public class Staircase {
	
	public static void staircase(int n) {
		
		// Line iteration
		for(int i = 1; i < n + 1; i++) {			
			// Spaces
			for(int j = 0; j < n - i; j++) {			
				System.out.print(" ");			
			}
			// Stars
			for(int k = 0; k < i; k++) {
				System.out.print("#");
			}
		System.out.println();
		}
		
	}

	public static void main(String[] args) {
		
		int n = 6;
		
		System.out.println("Staircase of size: " + n);
		staircase(n);
	}

}
