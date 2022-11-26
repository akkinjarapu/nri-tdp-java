package day024;

import java.util.function.Function;
import java.util.function.Supplier;

public class FPDemo08 {

	public static void main(String[] args) {
		Supplier<Character> supplier = () -> (char) (65 +  (int) (Math.random() * 26));
		System.out.println(supplier.get());
		
		Function<Integer, String> function = (t) -> {
			StringBuilder builder = new StringBuilder();
			for(int i = t; i > 0; i--) {
				builder.append(supplier.get());
			}
			
			return builder.toString();
		};
		
		System.out.println(function.apply(5));
		System.out.println(function.apply(10));
	}

}
