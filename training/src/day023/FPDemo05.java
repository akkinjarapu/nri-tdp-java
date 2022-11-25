package day023;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FPDemo05 {
	public static List<String> filter(List<String> strings, Predicate<String> predicate) {
		List<String> result = new ArrayList<>();
		
		for(String string: strings) {
			if(predicate.test(string)) {
				result.add(string);
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		List<String> result = 
				filter(List.of("Orange", "Mango", "Banana", "Apple"), 
						(t) -> t.endsWith("e"));
		System.out.println(result);
		
		result = 
				filter(List.of("Orange", "Mango", "Banana", "Apple"), 
						(t) -> !t.endsWith("e"));
		System.out.println(result);
	}

}
