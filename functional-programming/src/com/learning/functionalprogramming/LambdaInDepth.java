package com.learning.functionalprogramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

class MapImplement implements Function<Integer,Integer> {

	@Override
	public Integer apply(Integer t) {
		return t*t;
	}
	
}

class ForEach implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {
		System.out.println(t);
		
	}
	
}

public class LambdaInDepth {

	public static void main(String[] args) {
		//1. Storing functions in variables
		Predicate<? super Integer> evenPredicate = createEvenPredicate();
		List.of(23,43,34,35).stream().
		filter(evenPredicate).
		
		//2. passing a method
		//filter(n -> n%2==0)
		//map(n1 -> n1*n1).
		//forEach(n1 ->System.out.println(n1));
		map(new MapImplement()).
		forEach(new ForEach());
		

		//forEach(n1->System.out.println(n1));
		//Consumer<? super T> action
		//void accept(T t);
		
		
		//map(n1 -> n1*n1)
		//<R> Stream<R> map(Function<? super T, ? extends R> mapper)
		//R apply(T t);
		
		
		
	}

	//3. Returning functions from methods
	private static Predicate<? super Integer> createEvenPredicate() {
		return n1 -> n1%2==1;
	}

}
