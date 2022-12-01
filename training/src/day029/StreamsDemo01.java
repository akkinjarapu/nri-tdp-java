package day029;

import static java.util.Comparator.comparing;

public class StreamsDemo01 {

	public static void main(String[] args) {
		/* find the highest-calorie dish in the menu */
		Dish dish = Dishes.MENU
			.stream()
			.max(comparing(Dish::getCalories))
			.get();
		
		System.out.println(dish);
	}

}
