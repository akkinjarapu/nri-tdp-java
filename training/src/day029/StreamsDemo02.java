package day029;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.maxBy;

public class StreamsDemo02 {

	public static void main(String[] args) {
		/* find the highest-calorie dish in the menu */
		Dish dish = Dishes.MENU
			.stream()
			.collect(maxBy(comparing(Dish::getCalories)))
			.get();
		
		System.out.println(dish);
	}

}
