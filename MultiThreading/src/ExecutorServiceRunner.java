import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {

	private int number;

	public Task(int number) {
		this.number = number;
	}
	
	public void run() {
		System.out.println("task1 started");
		for(int i=number*100;i<number*100 + 99;i++) {
			System.out.print(i + " ");
		}
		System.out.println("task "+ number + "done");
	}
}


public class ExecutorServiceRunner {

	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		//executorService.execute(new Thread1());
		//executorService.execute(new Thread(new Task2()));
		executorService.execute(new Task(1));
		executorService.execute(new Task(2));
		executorService.shutdown();
	}

}
