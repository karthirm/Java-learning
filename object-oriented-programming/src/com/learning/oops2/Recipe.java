package com.learning.oops2;

public class Recipe extends AbstractRecipe {

	
	@Override
	void getReady() {
		System.out.println("get raw materials");
		System.out.println("get utensils");
		
	}

	@Override
	void prepareDish() {
		System.out.println("prepare dish which is good for health");
		
	}

	@Override
	void cleanUp() {
		System.out.println("clean the utensils");
		
	}

}
