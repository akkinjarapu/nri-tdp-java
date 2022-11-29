package day026;

import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo06 {

	public static void main(String[] args) {
		List<String> list = List.of("Anand", "Ravi", "Bhanu", "Pavani", "Parvathi", "Kiran", "Alex");
		
		Stream<String> stream = list.stream();
		long count = stream .count();
		System.out.println(count);
		
		count = stream .count();
		System.out.println(count);
	}

}
