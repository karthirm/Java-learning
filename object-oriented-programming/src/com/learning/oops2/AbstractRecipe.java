package com.learning.oops2;

public abstract class AbstractRecipe {
	
	public void execute() {
		getReady();
		prepareDish();
		cleanUp();
	}

	abstract void getReady();
	abstract void prepareDish();
	abstract void cleanUp();
	
}
