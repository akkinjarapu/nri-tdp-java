package day029;

import static java.util.stream.Collectors.partitioningBy;

import java.util.List;
import java.util.Map;

public class StreamsDemo13 {

	public static void main(String[] args) {
		Map<Boolean, List<Dish>> dishesByCaloryType = Dishes.MENU
				.stream()
				.collect(partitioningBy(Dish::isVegetarian));
		
		dishesByCaloryType.forEach((key, value) -> System.out.println(key + " -> " + value));
		
	}

}

