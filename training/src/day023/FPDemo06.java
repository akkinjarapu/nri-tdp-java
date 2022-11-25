package day023;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FPDemo06 {
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
		Predicate<String> predicate = (t) -> t.endsWith("e");
		
		List<String> result = 
				filter(List.of("Orange", "Mango", "Banana", "Apple"), predicate);
		System.out.println(result);
		
		result = 
				filter(List.of("Orange", "Mango", "Banana", "Apple"), predicate.negate());
		System.out.println(result);
	}

}
