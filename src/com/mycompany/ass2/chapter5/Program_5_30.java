package com.mycompany.ass2.chapter5;

public class Program_5_30 {

	private int accountNumber;
	private String makeAndModel;
	private String state;
	
	public Program_5_30(int accountNumber, String makeAndModel, String state){
		this.accountNumber = accountNumber;
	}
	
	public int getAccountNumber(){
		return accountNumber;
	}
	
	public void setMakeAndModel(String makeAndModel){
		this.makeAndModel = makeAndModel;
	}
	
	public String getMakeAndModel(){
		return makeAndModel;
	}
	
	public void setState(String state){
		
		if(state == "CT" || state == "MA" || state == "ME" || state == "NH" 
				|| state == "NJ" || state == "NY" || state == "PA" || state == "VT"){
			this.state = state;
		}else{
			System.out.println("Error");
		}
	}
	
	public String getState(){
		return state;
	}
	
	public boolean isNoFaultState(){
		boolean noFaultState;
		
		switch(getState()){
		case "MA": case "NJ": case "NY": case "PA":
			noFaultState = true;
			break;
			default:
				noFaultState = false;
				break;
		}
		return noFaultState;
	}

		
}

	


