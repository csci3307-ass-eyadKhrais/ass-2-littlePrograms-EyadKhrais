package com.mycompany.ass2.chapter5;

public class Program_5_18 {

	public static void main(String[] args) {

		int amount;
		int principal = 1000;
		int rate = 5;
		
		System.out.printf("%s%20s%n", "Year", "Amount of deposit");
		
		for(int year = 1; year <=10; ++year){
            amount = (principal) * ((100 + rate) ^ year);
            
			System.out.printf("%4d%, 4d%n", year, amount/100);
		}
	}

}
