package day026;

import java.util.Arrays;
import java.util.List;

public class StreamsDemo23 {

	public static void main(String[] args) {
		List<String> list = List.of("Anand", "Ravi", "Bhanu", "Pavani", "Parvathi", "Kiran", "Alex");
		
		list.stream()
			.map(t -> t.split(""))
			.flatMap(Arrays::stream)
			.distinct()
			.forEach(System.out::println);
	}

}
