package com.learning.concurrency;

public class BiCounter {

	private int i =0;
	private int j=0;
	synchronized public void incrementI() {
		i++;
		//get i
		//increment
		//set i

		
	}
	public int getI() {
		return i;
	}
	synchronized public void incrementJ() {
		i++;
		
		
	}
	public int getJ() {
		return i;
	}
	
	
	public String toString()
	{
		return "Values are :" + i + " " + j;
	}
}
