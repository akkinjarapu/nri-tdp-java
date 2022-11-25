package day023;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FPDemo07 {
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
		Predicate<String> predicate1 = (t) -> t.endsWith("e");
		Predicate<String> predicate2 = (t) -> t.length() > 5;
		
		List<String> list = List.of("Orange", "Mango", "Banana", "Apple");
		
		System.out.println(filter(list, predicate1));
		System.out.println(filter(list, predicate1.negate()));
		System.out.println(filter(list, predicate2));
		System.out.println(filter(list, predicate2.negate()));
		System.out.println(filter(list, predicate1.and(predicate2)));
		System.out.println(filter(list, predicate1.or(predicate2)));
	}

}
