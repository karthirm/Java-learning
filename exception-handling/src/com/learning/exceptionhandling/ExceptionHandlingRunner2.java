package com.learning.exceptionhandling;

public class ExceptionHandlingRunner2 {

	public static void main(String[] args) {
		method1();
		System.out.println("main ended");

	}

	private static void method1() {
		method2();
		System.out.println("method 1 ended");
	}

	private static void method2() {
		try {
//		String str = null;
//		System.out.println(str.length());
		int [] i = {1,2};
		int number = i[2];
			
		System.out.println("method 2 ended");
	}  catch (NullPointerException ex) {
		System.out.println("null");
		ex.printStackTrace();
	}
		catch (Exception ex) {
			System.out.println("excepti8  on");
		ex.printStackTrace(); 
		
	}
	}
}
