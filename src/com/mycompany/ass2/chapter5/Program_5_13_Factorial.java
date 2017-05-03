package com.mycompany.ass2.chapter5;

public class Program_5_13_Factorial {

	public static void main(String[] args) {

		long answer = 1;
		//long amount = 0;
		
		for(int i = 1; i <= 20; i++){
			
			answer *= answer+i;
			System.out.printf("%4d      %10d\n", i, answer);
			
	
		}
	}

}
