package day029;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.Map;

public class StreamsDemo10 {

	public static void main(String[] args) {
		Map<DishType, Long> dishesByCaloryType = Dishes.MENU
				.stream()
				.collect(groupingBy(Dish::getType, counting()));
		
		dishesByCaloryType.forEach((key, value) -> System.out.println(key + " -> " + value));
		
	}

}

