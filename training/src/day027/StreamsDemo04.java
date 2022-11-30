package day027;

import static java.util.Comparator.comparing;

import java.util.List;

public class StreamsDemo04 {

	public static void main(String[] args) {
		/*
		 * List names of dishes that are low in calories (<= 300), 
		 * sorted by number of calories descending order
		 */
		List<String> list = Dishes.menu
			.stream()
			.filter(t -> t.getCalories() <= 300)
			.sorted(comparing(Dish::getCalories).reversed())
			.map(Dish::getName)
			.toList();
		
		System.out.println(list);
	}

}
