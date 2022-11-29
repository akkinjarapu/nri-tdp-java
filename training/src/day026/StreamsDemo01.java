package day026;

import java.util.List;

public class StreamsDemo01 {

	public static void main(String[] args) {
		List<String> list = List.of("Anand", "Ravi", "Bhanu", "Pavani", "Parvathi", "Kiran", "Alex");
		System.out.println(list);
		
		list.stream()
			.forEach(System.out::println);
	}

}
