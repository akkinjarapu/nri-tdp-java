package day026;

import java.util.List;
import java.util.function.Predicate;

public class StreamsDemo10 {

	public static void main(String[] args) {
		List<String> list = List.of("Anand", "Ravi", "Bhanu", "Pavani", "Parvathi", "Kiran", "Alex");
		
		Predicate<String> predicate = t -> t.length() > 5;
		
		list.stream()
			.filter(predicate)
			.forEach(System.out::println);
		System.out.println("=======================");
		list.stream()
		.filter(predicate.negate())
		.forEach(System.out::println);
	}

}
