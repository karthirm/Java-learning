package com.learning.exceptionhandling;

public class CustomExceptionRunner {

class Amount {
	
	private int amount;
	private String currency;
	
	public Amount(int amount, String currency) {
		super();
		this.amount = amount;
		this.currency = currency;
	}

	@Override
	public String toString() {
		return "Amount [amount=" + amount + ", currency=" + currency + "]";
	}
	
	
	
}
	
	public static void main(String[] args) {
		

	}

}
