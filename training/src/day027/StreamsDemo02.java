package day027;

import java.util.List;

public class StreamsDemo02 {

	public static void main(String[] args) {
		List<String> list = List.of("Anand", "Ravi", "Bhanu", "Pavani", "Parvathi", "Kiran", "Alex");

		List<Character> list2 = list.stream()
				.reduce("", (s1, s2) -> s1.concat(s2))
				.chars()
				.mapToObj(t -> Character.valueOf((char) t))
				.toList();

		System.out.println(list2);
	}

}
