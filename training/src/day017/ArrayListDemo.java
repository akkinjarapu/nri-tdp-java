package day017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>();
		
		words.add("Second");
		words.add(0, "First");
		System.out.println(words);
		
		List<String> unmodifiableList = Collections.unmodifiableList(words);
		System.out.println(unmodifiableList);
		
//		unmodifiableList.add("Third");
		
		words.add("Third");
		System.out.println(words);
		System.out.println(unmodifiableList);
		System.out.println(words == unmodifiableList);
		
		List<String> copyOf = List.copyOf(unmodifiableList);
		System.out.println(copyOf);
		
//		copyOf.add("Fourth");
		
		words.add("Fourth");
		System.out.println(words);
		System.out.println(copyOf);
	}

}
