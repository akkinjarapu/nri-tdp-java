package day024;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class FPDemo12 {

	public static void main(String[] args) {
		Predicate<String> predicate = (t) -> t.length() == 5;
		System.out.println(predicate.test("anand"));
		System.out.println(predicate.test("tirumala"));
		
		BiPredicate<String, Integer> biPredicate = (t, u) -> t.length() == u;
		System.out.println(biPredicate.test("anand", 5));
		System.out.println(biPredicate.test("tirumala", 8));
		
		List<String> list = List.of("a", "an", "the", "and", "or", "not")
			.stream()
			.filter((s) -> biPredicate.test(s, 3))
			.toList();
		
		System.out.println(list);
	}

}
