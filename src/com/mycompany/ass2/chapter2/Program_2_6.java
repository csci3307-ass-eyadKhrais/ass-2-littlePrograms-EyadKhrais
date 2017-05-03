package com.mycompany.ass2.chapter2;

import java.util.Scanner;

public class Program_2_6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x, y, z, result;
		
		System.out.println("Enter the First Integer");
		x = input.nextInt();
		System.out.println("Enter the Second Integer");
		y = input.nextInt();
		System.out.println("Enter the Third Integer");
		z = input.nextInt();
		
		result = x*y*z;
		System.out.printf("Product is %d%n", result);
		
			
	}

}
