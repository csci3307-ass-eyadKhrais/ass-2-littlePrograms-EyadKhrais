package com.mycompany.ass2.chapter4;
import java.util.Scanner;

public class Program_4_10 {

	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);
		
	int total = 0;
	int gradeCounter = 0;
	
	System.out.println("Enter grade or -1 to quit");
	int grade = input.nextInt();
	
	while(grade != -1){
		total = total + grade;
		gradeCounter = gradeCounter +1;
		
		System.out.println("Enter grade or -1 to quit: ");
		grade = input.nextInt();
		}
	
	if(gradeCounter != 0){
		double average = (double) total / gradeCounter;
		
		System.out.printf("%nTotal of the %d grades entered is %d%n", average);
	}
	else
		System.out.println("No grades were entered");
	}
}
