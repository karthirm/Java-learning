package collections;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String> {

	
	@Override
	public int compare(String value1, String value2) {
		//return Integer.compare(value1.length(), value2.length());
		return Integer.compare(value1
				                  .length(), value1.length());
	}
	
}
public class QueueRunner {

	public static void main(String[] args) {
		 
		//Queue<String>queue = new PriorityQueue<>(List.of("apple","orange","saathukudi","vaazhapazham"));
		Queue<String>queue = new PriorityQueue<>(new StringLengthComparator());
		queue.addAll(List.of("apple","orange","saathukudi","vaazhapazham"));
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue);	
	}
}
