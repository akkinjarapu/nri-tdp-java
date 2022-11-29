package day026;

import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo07 {

	public static void main(String[] args) {
		List<String> list = List.of("Anand", "Ravi", "Bhanu", "Pavani", "Pavani", "Bhanu", "Alex");
		
		Stream<String> stream = list.stream();
		stream.distinct().forEach(System.out::println);
	}

}
