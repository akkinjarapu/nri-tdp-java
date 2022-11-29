package day026;

import java.util.List;

public class StreamsDemo03 {

	public static void main(String[] args) {
		List<String> list = List.of("Anand", "Ravi", "Bhanu", "Pavani", "Parvathi", "Kiran", "Alex");
		
		boolean allMatch = list.stream()
			.anyMatch(t -> t.length() > 10);
		System.out.println(allMatch);
		
		allMatch = list.stream()
				.anyMatch(t -> t.length() >= 3);
		System.out.println(allMatch);
	}

}
