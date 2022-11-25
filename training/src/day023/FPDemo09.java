package day023;

import java.util.List;
import java.util.function.Consumer;

public class FPDemo09 {
	public static <T> void forEach(List<T> objects, Consumer<T> consumer) {
		for(T object: objects) {
			consumer.accept(object);
		}
	}

	public static void main(String[] args) {
		Consumer<String> consumer = (t) -> System.out.println(t);
		consumer.accept("NRI TDP");
		
		Consumer<Integer> consumer1 = System.out::println; // method reference
		consumer1.accept(100);
		
		forEach(List.of("Orange", "Mango", "Banana", "Apple"), consumer);
		
		forEach(List.of(1,2,3,4,5), consumer1);
	}

}
