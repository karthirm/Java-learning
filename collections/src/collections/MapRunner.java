package collections;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {
	public static void main(String args[]) {
		
		//find out the words along with the no. of occurrences for each one
		//eg - A occurs 1 time, g occurs 2 times and so on
		String str = "Karthikeyan is going to get an awesome job with help of god";
		
		Map<Character,Integer> occurrences = new HashMap<>();
		
		char[] characters = str.toCharArray();
		for(char character:characters) {
			//Iterate the loop & get the characters
			Integer integer = occurrences.get(character);
			//if its null, assign value as 1
			if(integer==null) {
				occurrences.put(character, 1);
			}
			//if its present & recurring again then increment by 1
			else {
				occurrences.put(character, integer+1);
			}
		}
		
		System.out.println(occurrences);
		
		//find out the strings along with no. of occurrences for reach one
		
		Map<String,Integer> stringOccurrences = new HashMap<>();
		
		String[] words = str.split(" ");
		for(String word:words) {
			//Iterate the loop & get the String
			Integer integer = stringOccurrences.get(word);
			//if its null, assign value as 1
			if(integer==null) {
				stringOccurrences.put(word, 1);
			}
			//if its present & recurring again then increment by 1
			else {
				stringOccurrences.put(word, integer+1);
			}
		}
		
		System.out.println(stringOccurrences);
		
		
		
	}
}
