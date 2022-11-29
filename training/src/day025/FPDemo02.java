package day025;

import java.util.function.BiConsumer;

public class FPDemo02 {
	public static void main(String[] args) {
		BiConsumer<String, Integer> consumer = (t, u) -> {
			System.out.println(t);
			System.out.println(u);
		};
		
		BiConsumer<String, String> consumer1 = (t, u) -> {
			System.out.println(t.contains(u));
			System.out.println(u.contains(t));
		};
		
		consumer1.accept("TDP", "TDP");
		
		consumer.andThen(consumer).accept("NRI", 10);
	}
}
