package com.canddella.utility;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scanner.nextInt();
		boolean containsEven = containsEven(number);
		if (containsEven)
		{
			System.out.println("The given number is a even number");
		}
		else 
		{
			System.out.println("The given number is a odd number");
		}
	}

	private static boolean containsEven(int number) {
		
		return number % 2 == 0;
	}

}
