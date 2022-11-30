package day027;

import java.util.Arrays;
import java.util.List;

public class StreamsDemo03 {

	public static void main(String[] args) {
		List<String> list = List.of("Anand", "Ravi", "Bhanu", "Pavani", "Parvathi", "Kiran", "Alex");

		List<Character> list2 = list.stream()
				.map(t -> t.split(""))
				.flatMap(Arrays::stream)
				.map(t -> t.charAt(0))
				.distinct()
				.toList();

		System.out.println(list2);
	}

}
