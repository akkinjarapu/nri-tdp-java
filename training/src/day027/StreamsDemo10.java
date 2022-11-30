package day027;

import java.util.OptionalInt;

public class StreamsDemo10 {

	public static void main(String[] args) {
		/*
		 * max calorie value
		 */
		OptionalInt max = Dishes.menu
			.stream()
			.mapToInt(Dish::getCalories)
			.max();
//			.summaryStatistics();
//			.map(Dish::getCalories) // Integers
//			.sum(); //cant't apply on integers
		
		System.out.println(max.getAsInt());
	}

}
