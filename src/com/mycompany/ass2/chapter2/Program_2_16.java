package com.mycompany.ass2.chapter2;

import java.util.Scanner;

public class Program_2_16 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x1, x2;
		
		System.out.println("Enter the first integer: ");
		x1 = input.nextInt();
		System.out.println("Enter the second integer: ");
		x2 = input.nextInt();
		
		if(x1 > x2)
			System.out.println(x1 + " is greater than " + x2);
		else if(x2 > x1)
			System.out.println(x2 + " is greater than " + x1);
		else
			System.out.println("The numbers are equal");

	}

}
