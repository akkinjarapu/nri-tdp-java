package day017;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		ArrayList<String> words = 
				new ArrayList<>(
						List.of("ant", "Bat", "Cat", "Dog", "Bat"));
		
//		words.remove(1);
//		words.remove("Bat"); // removes bat at position 2
//		words.removeAll(List.of("Bat")); // removes all Bats
//		words.removeIf(word -> word.contains("a"));
//		words.removeIf(word -> word.endsWith("at"));
		
		// Not Correct left the Cat though it ends with at
//		for(int i = 0; i < words.size(); i++) {
//			if (words.get(i).endsWith("at"))
//				words.remove(words.get(i));
//		}
		
		Iterator<String> iterator = words.iterator();
		
		while(iterator.hasNext()) {
			if(iterator.next().endsWith("at"))
				iterator.remove();
		}
		
		System.out.println(words);

	}

}
