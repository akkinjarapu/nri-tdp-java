package day029;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.partitioningBy;

import java.util.List;
import java.util.Map;

public class StreamsDemo17 {

	public static void main(String[] args) {
		Map<DishType, Map<Boolean, List<Dish>>> dishesByCaloryType = Dishes.MENU
				.stream()
				.collect(groupingBy(Dish::getType, partitioningBy(d -> d.getCalories() <= 400)));
		
		dishesByCaloryType.forEach((key, value) -> System.out.println(key + " -> " + value));
		
	}

}

