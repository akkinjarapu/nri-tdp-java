package day024;

import java.util.function.Function;
import java.util.function.IntSupplier;

public class FPDemo09 {

	public static void main(String[] args) {
		IntSupplier supplier = () -> 65 +  (int) (Math.random() * 26);
		
		Function<Integer, String> function = (t) -> {
			StringBuilder builder = new StringBuilder();
			for(int i = t; i > 0; i--) {
				builder.append((char) supplier.getAsInt());
			}
			
			return builder.toString();
		};
		
		System.out.println(function.apply(5));
		System.out.println(function.apply(10));
	}

}
