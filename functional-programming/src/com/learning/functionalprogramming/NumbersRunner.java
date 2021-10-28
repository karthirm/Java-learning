package com.learning.functionalprogramming;

import java.util.List;

public class NumbersRunner {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(1,2,3,4);
		
		//print all numbers using lambda
		//numbers.stream().forEach(element -> System.out.println(element));
		
		//even numbers
		System.out.println("printing even numbers");
		numbers.stream().filter(element -> element%2==0).forEach(element -> System.out.println(element));
		
		//odd numbers
		System.out.println("printing odd numbers");
		numbers.stream().filter(element -> element%2==1).forEach(element -> System.out.println(element));

	}

}
