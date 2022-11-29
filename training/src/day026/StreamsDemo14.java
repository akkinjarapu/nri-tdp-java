package day026;

import java.util.List;

public class StreamsDemo14 {

	public static void main(String[] args) {
		List<String> list = List.of("Anand", "Ravi", "Bhanu", "Pavani", "Parvathi", "Kiran", "Alex");
		
		list.stream()
			.filter(t -> t.length() > 4)
			.map(t -> t + "=" + t.length())
			.sorted()
			.forEach(System.out::println);
	}

}
