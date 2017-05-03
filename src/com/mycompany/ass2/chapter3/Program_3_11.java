package com.mycompany.ass2.chapter3;

public class Program_3_11 {

	private String name;
	private double balance;
	
	public Program_3_11(String name, double balance){
		this.name = name;
		
		if(balance > 0.0)
			this.balance = balance;
	}
	
	public void deposit(double depositAmount){
		if(depositAmount > 0.0)
			balance = balance+ depositAmount;
	}
	
	public void withdraw(double withdrawlAmount){
		if(withdrawlAmount <= balance)
			balance = balance - withdrawlAmount;
		else
			System.out.println("Withdrawl amount exceeded account balance");
	}
	
	public double getbalance(){
		
		return balance;
	}
	
	public void setName(String name){
		
		this.name  = name;
	}
	
	public String getName(){
		
		return name;
	}
}
