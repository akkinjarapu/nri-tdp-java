package day026;

import static java.util.stream.Collectors.groupingBy;

import java.util.List;
import java.util.Map;

public class StreamsDemo11 {

	public static void main(String[] args) {
		List<String> list = List.of("Anand", "Ravi", "Bhanu", "Pavani", "Parvathi", "Kiran", "Alex");
		
		Map<Integer, List<String>> map = 
				list.stream().collect(groupingBy(String::length));
		
		System.out.println(map);
	}

}
