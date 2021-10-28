package collections;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

	public static void main(String[] args) {
		List<Character> Characters = List.of('A', 'Z', 'A', 'D', 'B','F');
		Set<Character> uniqueElements = new TreeSet<>(Characters); 
		System.out.println(uniqueElements);

	}

}
