package day029;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.maxBy;

import java.util.Map;
import java.util.Optional;

public class StreamsDemo11 {

	public static void main(String[] args) {
		Map<DishType, Optional<Dish>> dishesByCaloryType = Dishes.MENU
				.stream()
				.collect(groupingBy(Dish::getType, maxBy(comparing(Dish::getCalories))));
		
		dishesByCaloryType.forEach((key, value) -> System.out.println(key + " -> " + value));
		
	}

}

