package com.learning.concurrency;

public class Counter {

	int i =0;
	synchronized public void increment() {
		i++;
		//get i
		//increment
		//set i
		//3 operations, not ideal when 2 or more threads are trying to increment it
		//get i -- initial value is 15
		//increment --1st thread -16, 2nd thread - 16
		//set i --16 but it should be 17
		//so this is not atomic, not a thread safe operation - make it as synchronize
		
	}
	public int getI() {
		return i;
	}
	
	public String toString()
	{
		return "i Value:" + i;
	}
}
