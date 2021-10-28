package com.learning.oops;

public class BookRunner {

	public static void main(String[] args) {
		Book book = new Book(123, "Oops by Ranga/Chad", "Karthi");
		book.addReview(new Review(10,"Great",4));
		book.addReview(new Review(13,"Arumai",5));
		
		System.out.println(book);

	}

}
