package com.learning.oops;

public class Fan {
	private String make;
	private double radius;
	private String colour;
	
	private boolean isOn;
	private byte speed;

	
	public Fan(String make,double radius,String colour) {
		this.make = make;
		this.radius = radius;
		this.colour = colour;
	}
	
	public void setSpeed(byte speed) {
		this.speed = speed;
	}
	
	public void switchOn() {
		this.isOn = true;
		setSpeed((byte) 4);
	}
	
	public void switchOff() {
		this.isOn = false;
		setSpeed((byte) 0);
	}
	
	public String toString() {
		return "make - " + make + " color - " + colour + " radius-" + radius +
		"isOn -"+ isOn + " speed- " + speed;
	}
	
}
