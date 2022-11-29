package day025;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class FPDemo04 {
	public static void main(String[] args) {
		BiFunction<String, Integer, Boolean> biFunction = 
				(t, u) -> t.length() == u;
				
		System.out.println(biFunction.apply("NRI", 3));
		
		BiPredicate<String, Integer> predicate = (t, u) -> t.length() == u;
		System.out.println(predicate.test("NRI", 3));
	}

}
