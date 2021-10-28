package com.learning.functionalprogramming;

import java.util.List;

public class ListNumberRunner {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(1,4,6,23,88,60);
		int sum = numbers.stream().filter(element -> element%2==1).reduce(0
				, (number1, number2) -> number1 + number2);
		
		System.out.println(sum);
		
		printSum(numbers);
		
	/*	int sum2 = numbers.stream().reduce(0,  (number1, number2) -> {
			System.out.println(number1 + " "+ number2);
			return number1 + number2;}); */
		
		//System.out.println(sum1 );

	}

	private static void printSum(List<Integer> numbers) {
		int sum1 = numbers.stream().reduce(0,  (number1, number2) -> {
			System.out.println(number1 + " "+ number2);
			return number1+number2;});
	}

}
