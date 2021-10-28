package com.learning.oops;

public class Rectangle {

	private int length;
	private int breadth;
	//public char[] perimeter;
	
	Rectangle (int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	public int area() {
		return length*breadth;
	}
	
	public int perimter() {
		return 2* (length+breadth);
	}

	public int getLength() {
		return length;
	}



	public void setLength(int length) {
		this.length = length;
	}



	public int getBreadth() {
		return breadth;
	}



	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + ", area()=" + area() + ", perimter()="
				+ perimter() + ", getLength()=" + getLength() + ", getBreadth()=" + getBreadth() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}



	
	
	
	
}
