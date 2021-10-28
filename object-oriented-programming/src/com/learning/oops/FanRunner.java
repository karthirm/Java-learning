package com.learning.oops;

public class FanRunner {

	public static void main(String[] args) {
		Fan fan = new Fan("Manufacturer", 0.23, "brown");
		fan.switchOff();
		System.out.println(fan.toString());
		fan.setSpeed((byte) 5);
		System.out.println(fan.toString());
	}
}
