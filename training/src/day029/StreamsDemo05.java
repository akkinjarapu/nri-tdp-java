package day029;

import static java.util.stream.Collectors.groupingBy;

import java.util.List;
import java.util.Map;

public class StreamsDemo05 {

	public static void main(String[] args) {
		Map<Boolean, List<Dish>> dishesByType = Dishes.MENU
				.stream()
				.collect(groupingBy(Dish::isVegetarian));
		
		dishesByType.forEach((key, value) -> System.out.println(key + " -> " + value));
		
	}

}
