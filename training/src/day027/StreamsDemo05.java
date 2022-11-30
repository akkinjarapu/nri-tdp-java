package day027;

import java.util.List;

import static java.util.Comparator.comparing;

public class StreamsDemo05 {

	public static void main(String[] args) {
		/*
		 * find out top three high calorie (> 300) dish names 
		 */
		List<String> list = Dishes.menu
			.stream()
			.filter(t -> t.getCalories() > 300)
			.sorted(comparing(Dish::getCalories).reversed())
			.limit(3)
			.map(Dish::getName)
			.toList();
		
		System.out.println(list);
	}

}
