package day029;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.partitioningBy;

import java.util.List;
import java.util.Map;

public class StreamsDemo16 {

	public static void main(String[] args) {
		Map<Boolean, Map<DishType, List<Dish>>> dishesByCaloryType = Dishes.MENU
				.stream()
				.collect(partitioningBy(Dish::isVegetarian, groupingBy(Dish::getType)));
		
		dishesByCaloryType.forEach((key, value) -> System.out.println(key + " -> " + value));
		
	}

}

