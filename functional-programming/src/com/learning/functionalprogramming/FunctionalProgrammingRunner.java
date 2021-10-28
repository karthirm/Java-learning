package com.learning.functionalprogramming;

import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {
		
		List<String> list = List.of("Apple","Banana","Saathukuda","vaazhaipala");
		
	//	printValue(list);
	//	printValueWithFilter(list);
	//	printWithFP(list);
		printWithFPWithFilter(list);

	}
	private static void printValue(List<String> list) {
		for(String list1:list) {
			System.out.println(list1);
		}
	}
	
	private static void printValueWithFilter(List<String> list) {
		for(String list1:list) {
			if(list1.endsWith("a"))
			System.out.println(list1);
		}
	}
	
	private static void printWithFP(List<String> list) {
		list.stream().forEach(element -> System.out.println(element));		
		//System.out.println("first time fp " + list);
	}
	
	private static void printWithFPWithFilter(List<String> list) {
		list.stream().filter(
				element -> element.endsWith("a")
				).
		forEach(
				element -> System.out.println(element));		
	//	System.out.println("this time fp " + list);
		
	}

}
