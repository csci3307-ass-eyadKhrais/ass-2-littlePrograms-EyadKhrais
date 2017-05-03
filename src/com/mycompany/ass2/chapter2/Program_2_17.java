package com.mycompany.ass2.chapter2;

import java.util.Scanner;

public class Program_2_17 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x1, x2, x3, sum, product, average;
		
		System.out.println("Enter the first integer: ");
		x1 = input.nextInt();
		System.out.println("Enter the second integer: ");
		x2 = input.nextInt();
		System.out.println("Enter the third integer: ");
		x3 = input.nextInt();
		
		sum = x1 + x2 + x3;
		average = (x1+x2+x3)/3;
		product = x1 * x2;
		
		System.out.printf("Sum is %d%n", sum);
		System.out.printf("Average is %d%n", average);
		System.out.printf("Product is %d%n", product);

		if(x1 >= x2 && x1 >= x3)
			System.out.println(x1 + " is the largest number");
		else if(x2 >= x1 && x2 >= x3)
			System.out.println(x2 + " is the largest number");
		else if(x3 >= x1 && x3 >= x3)
			System.out.println(x3 + " is the largest number");

	}

}
