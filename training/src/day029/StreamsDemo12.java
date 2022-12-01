package day029;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.maxBy;

import java.util.Map;
import java.util.Optional;

public class StreamsDemo12 {

	public static void main(String[] args) {
		Map<DishType, Dish> dishesByCaloryType = Dishes.MENU
				.stream()
				.collect(groupingBy(Dish::getType, 
						collectingAndThen(maxBy(comparing(Dish::getCalories)), Optional<Dish>::get)));
		
		dishesByCaloryType.forEach((key, value) -> System.out.println(key + " -> " + value));
		
	}

}

