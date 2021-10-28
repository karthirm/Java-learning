package com.learning.functionalprogramming;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class SquaresRunner {

	public static void main(String[] args) {
		// print square of 1st 10 nos. using functional programming
		IntStream.range(1, 11).map(p -> p*p).forEach(p -> System.out.println(p));
		
		System.out.println(" ");
		
		//map list elements to lowercase and print
		List<String> list = List.of("Apple", "Ant", "Cat"); 
		list.stream().map(e -> e.toLowerCase()).forEach(e ->System.out.println(e));
		
		System.out.println(" ");
		  
		
		//print length of each element
		List<String> list2 = List.of("Apple", "Ant", "Cat"); 
		list2.stream().map(e -> e.length()).forEach(e -> System.out.println(e));

	}

}
