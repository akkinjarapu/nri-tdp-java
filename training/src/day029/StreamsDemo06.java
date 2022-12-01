package day029;

import static java.util.stream.Collectors.groupingBy;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsDemo06 {

	public static void main(String[] args) {
		Map<DishType, List<Dish>> dishesByType = Dishes.MENU
				.stream()
				.collect(groupingBy(Dish::getType, Collectors.toList()));
		
		dishesByType.forEach((key, value) -> System.out.println(key + " -> " + value));
		
	}

}
