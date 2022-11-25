package day023;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FPDemo02 {
	public static List<Boolean> map(List<String> strings, Predicate<String> predicate) {
		List<Boolean> result = new ArrayList<>();
		
		for(String string: strings) {
			result.add(predicate.test(string));
		}
		
		return result;
	}

	public static void main(String[] args) {
		Predicate<String> predicate = (t) -> t.endsWith("e");
		
		List<Boolean> result = 
				map(List.of("Orange", "Mango", "Banana", "Apple"), predicate);
		System.out.println(result);
	}

}
