package com.learning.generics;

public class GenericsRunner {

	public static void main(String[] args) {
		
		MyCustomList<String> list = new MyCustomList<>();
		list.addElement("element1");
		list.addElement("element2");
		String value = list.get(0);
		
		
		MyCustomList<Integer> list1 = new MyCustomList<>();
		list1.addElement(Integer.valueOf(5));
		list1.addElement(Integer.valueOf(8));
		Integer number = list1.get(0);
		
		System.out.println(list + " "+list1);
		System.out.println(value + " "+ number);
	}

}
