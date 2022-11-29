package day026;

import java.util.Set;
import java.util.stream.Stream;

public class StreamsDemo09 {

	public static void main(String[] args) {
		Set<String> list = Set.of("Anand", "Ravi", "Bhanu", "Pavani", "Parvathi", "Kiran", "Alex");
		
		Stream<String> stream = list.stream();
		System.out.println(stream.findAny());
		System.out.println(list.stream().findFirst());
	}

}
