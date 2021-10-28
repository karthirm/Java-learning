package com.learning.oops.interfaces;

 interface Flyable {
	void fly();
 }	
	
	class Bird implements Flyable {

		@Override
		public void fly() {
			System.out.println("with wings");
			
		}
		
	}
	
	class Aeroplane implements Flyable{

		@Override
		public void fly() {
			System.out.println("with fuel");
			
		}

		@Override
		public String toString() {
			return "Aeroplane [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
		}
		
	}

	public class FlyableRunner {
		public static void main(String args[]) {
			Flyable [] flyingObjects = {new Bird(), new Aeroplane()};
			for(Flyable object: flyingObjects) {
				System.out.println(object);
			}
		}
	}
	


