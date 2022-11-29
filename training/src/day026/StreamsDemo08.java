package day026;

import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo08 {

	public static void main(String[] args) {
		List<String> list = List.of("Anand", "Ravi", "Bhanu", "Pavani", "Parvathi", "Kiran", "Alex");
		
		Stream<String> stream = list.stream();
		System.out.println(stream.findAny());
		
		System.out.println(Stream.empty().findAny());
	}

}
