package com.learning.functionalprogramming;

import java.util.List;

public class MethodReferencesRunner {

	
	public static void main(String[] args) {
		
		List.of("Ant","Cat","Bat","yaanai","poonai").stream().map(n1 ->n1.length()).
		forEach(n1 -> System.out.println(n1));
		
		List.of("Ant","Cat","Bat","yaanai","poonai").stream().map(n1 ->n1.length()).
		
		forEach(System.out::println);

	}

}
