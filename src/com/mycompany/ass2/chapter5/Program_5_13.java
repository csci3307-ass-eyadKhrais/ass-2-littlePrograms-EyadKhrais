package com.mycompany.ass2.chapter5;

public class Program_5_13 {

	public static void main(String[] args) {

		int count;
		
		for(count = 1; count <= 10; count++){
			if(count == 5)
				break;
			
			System.out.printf("%d ", count);
		}
		
		System.out.printf("%nBroke out of loop at count = %d%n", count);
		
		int counter = 2;
		
		do{
			System.out.println(counter);
			counter +=2;
		}while(counter <= 100);
	}

}
