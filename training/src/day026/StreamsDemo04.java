package day026;

import java.util.List;

public class StreamsDemo04 {

	public static void main(String[] args) {
		List<String> list = List.of("Anand", "Ravi", "Bhanu", "Pavani", "Parvathi", "Kiran", "Alex");
		
		boolean parallel = list.stream()
				.isParallel();
		System.out.println(parallel);
		
		parallel = list.parallelStream()
				.isParallel();
		System.out.println(parallel);
	}

}
