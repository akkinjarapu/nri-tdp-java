package day024;

import java.util.function.IntFunction;
import java.util.function.IntSupplier;

public class FPDemo10 {
	static private final char[] specials = new char[] {'#', '$', '%', '@', '&', '!', '*'};
	
	private static final IntSupplier[] suppliers = new IntSupplier[] {
			() -> 65 +  (int) (Math.random() * 26), // upper
			() -> 97 +  (int) (Math.random() * 26), // lower
			() -> 48 +  (int) (Math.random() * 10), // digits
			() -> specials[(int) (Math.random() * specials.length)] // special characters
	};
	
	public static String generator(int length) {
		StringBuilder builder = new StringBuilder();
		for(int i = length + (int) (Math.random() * (15 - length)); i > 0; i--) {
			int index = (int) (Math.random() * 4);
			builder.append((char) suppliers[index].getAsInt());
		}
		
		builder.trimToSize();
		return builder.toString();
	}

	public static void main(String[] args) {
		IntFunction<String> function = FPDemo10::generator;
		System.out.println(function.apply(5));
	}

}
