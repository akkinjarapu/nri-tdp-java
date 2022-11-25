package day023;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FPDemo08 {
	public static <T> List<T> filter(List<T> objects, Predicate<T> predicate) {
		List<T> result = new ArrayList<>();
		
		for(T object: objects) {
			if(predicate.test(object)) {
				result.add(object);
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		System.out.println(filter(List.of("Orange", "Mango", "Banana", "Apple"), 
				(t) -> t.length() > 5));
		
		System.out.println(filter(List.of(1,2,3,4,5), 
				(t) -> (t & 1) != 0));
	}

}
