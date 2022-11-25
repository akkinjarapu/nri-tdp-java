package day023;

import java.util.function.Predicate;

public class FPDemo01 {

	public static void main(String[] args) {
		Predicate<String> predicate = new Predicate<String>() {
			
			@Override
			public boolean test(String t) {
				return t.endsWith("e");
			}
		};
		
		Predicate<String> predicate2 = (t) -> t.endsWith("e");
		
		System.out.println(predicate.test("Orange"));
		System.out.println(predicate2.test("Orange"));
	}

}
