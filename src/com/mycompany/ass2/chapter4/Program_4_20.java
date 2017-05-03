package com.mycompany.ass2.chapter4;

import java.util.Scanner;

public class Program_4_20 {
	
public static void main(String[] args)
{	
	grossPay();
	grossPay();
	grossPay();
}
	
	public static void grossPay(){
		
		Scanner input = new Scanner( System.in );
		double hours, pay;
		String name;
		
		System.out.println("Enter the employees name ");
		name = input.nextLine();
		
		System.out.print( "Enter the number of hours that " + name + " Worked ");
		hours = input.nextDouble();

		
		System.out.println("Enter the payrate of " + name);
		pay = input.nextDouble();

		if (hours <= 40 )
			System.out.printf( name + " gross pay is %.2f\n", hours * pay );

		else
		{

		System.out.printf( name + " gross pay is is %.2f\n", (hours * pay) +
		(hours - 40 * (pay * 1.5)) );

		}
		
	}
}
