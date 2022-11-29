package day026;

import java.util.List;

public class StreamsDemo02 {

	public static void main(String[] args) {
		List<String> list = List.of("Anand", "Ravi", "Bhanu", "Pavani", "Parvathi", "Kiran", "Alex");
		
		boolean allMatch = list.stream()
			.allMatch(t -> t.length() > 5);
		System.out.println(allMatch);
		
		allMatch = list.stream()
				.allMatch(t -> t.length() >= 3);
		System.out.println(allMatch);
	}

}
