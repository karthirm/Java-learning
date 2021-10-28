
class Thread1 extends  Thread {
	public void run() {
		System.out.println("task1 started");
		for(int i=101;i<199;i++) {
			System.out.print(i + " ");
		}
		
		System.out.println("\nTask1 done");
	}	
}

class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.println("task2 started");
		for(int i=201;i<299;i++) {
			System.out.println(i + " ");
		}
		System.out.println("\nTask2done");
	}
	
}

public class ThreadsBasicRunner {

	public static void main(String[] args) throws InterruptedException {
		
		//Task1
		System.out.println("task1 kicked off");
		Thread1 thread1 = new Thread1();
		thread1.setPriority(10);
		thread1.start();
		
		thread1.sleep(100);
		
		//Task2
		System.out.println("task2 kicked off");
		Task2 task2 = new Task2();
		Thread thread = new Thread(task2);
		thread.start();
		
		//System.out.println("\nTask2 done");
		
		//Task3
		thread1.join();
		System.out.println("task3 started");
		for(int i=301;i<399;i++) {
			System.out.println(i);
		}
		
		System.out.println("\nTask3 done");

		System.out.println("\nMain done");
	}

}
