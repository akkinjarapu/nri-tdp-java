package day025;

import java.util.function.BiConsumer;

public class FPDemo01 {
	public static void main(String[] args) {
		BiConsumer<String, Integer> consumer = (t, u) -> {
			System.out.println(t);
			System.out.println(u);
		};
		
		consumer.accept("NRI", 10);
	}
}
