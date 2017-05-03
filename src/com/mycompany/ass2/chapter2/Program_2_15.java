/**
 * 
 */
package com.mycompany.ass2.chapter2;

import java.util.Scanner;

/**
 * @author eyad
 *
 */
public class Program_2_15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x1, x2, sum, product, quotient, difference;
		
		System.out.println("Enter the first integer: ");
		x1 = input.nextInt();
		System.out.println("Enter the second integer: ");
		x2 = input.nextInt();
		
		sum = x1 + x2;
		product = x1 * x2;
		quotient = x1/2;
		if(x1 >= x2)
			difference  = x1-x2;
		else 
			difference  = x2 - x1;
		System.out.printf("Sum is %d%n", sum);
		System.out.printf("Product is %d%n", product);
		System.out.printf("Quotient is %d%n", quotient);
		System.out.printf("Difference is %d%n", difference);

	}

}
