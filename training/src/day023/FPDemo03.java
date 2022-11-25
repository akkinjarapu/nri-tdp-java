package day023;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FPDemo03 {
	public static List<Boolean> map(List<String> strings, Predicate<String> predicate) {
		List<Boolean> result = new ArrayList<>();
		
		for(String string: strings) {
			result.add(predicate.test(string));
		}
		
		return result;
	}

	public static void main(String[] args) {
		List<Boolean> result = 
				map(List.of("Orange", "Mango", "Banana", "Apple"), 
						(t) -> t.endsWith("e"));
		System.out.println(result);
		
		result = 
				map(List.of("Orange", "Mango", "Banana", "Apple"), 
						(t) -> t.contains("an"));
		System.out.println(result);
	}

}
