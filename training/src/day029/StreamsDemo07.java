package day029;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toSet;

import java.util.Map;
import java.util.Set;

public class StreamsDemo07 {

	public static void main(String[] args) {
		Map<DishType, Set<Dish>> dishesByType = Dishes.MENU
				.stream()
				.collect(groupingBy(Dish::getType, toSet()));
		
		dishesByType.forEach((key, value) -> System.out.println(key + " -> " + value));
		
	}

}
