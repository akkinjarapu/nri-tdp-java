package day026;

import java.util.Comparator;
import java.util.List;

public class StreamsDemo18 {

	public static void main(String[] args) {
		List<String> list = List.of("Anand", "Ravi", "Bhanu", "Pavani", "Parvathi", "Kiran", "Alex");
		
		list.stream()
			.filter(t -> t.length() > 4)
			.map(t -> t.length() + "=" + t)
			.sorted(Comparator.reverseOrder())
			.skip(2)
			.forEach(System.out::println);
	}

}
