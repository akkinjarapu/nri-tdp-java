package day026;

import java.util.List;

public class StreamsDemo12 {

	public static void main(String[] args) {
		List<String> list = List.of("Anand", "Ravi", "Bhanu", "Pavani", "Parvathi", "Kiran", "Alex");
		
		list.stream()
			.map(String::length)
			.forEach(System.out::println);
	}

}
