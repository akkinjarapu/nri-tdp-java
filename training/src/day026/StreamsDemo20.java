package day026;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamsDemo20 {

	public static void main(String[] args) {
		List<String> list = List.of("Anand", "Ravi", "Bhanu", "Pavani", "Parvathi", "Kiran", "Alex");
		
		Optional<String> reduce = list.stream()
			.filter(t -> t.length() > 4)
			.map(t -> t.length() + "=" + t)
			.sorted(Comparator.reverseOrder())
			.reduce((first, second) -> second);
		
		System.out.println(reduce);
	}

}
