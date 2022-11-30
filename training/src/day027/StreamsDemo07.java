package day027;

import java.util.List;

import static java.util.Comparator.comparing;

public class StreamsDemo07 {

	public static void main(String[] args) {
		/*
		 * find out three high calorie (> 300) dish names 
		 */
		List<String> list = Dishes.menu
//				.stream()
			.parallelStream()
			.filter(t -> {
				System.out.println("Filtering: " + t.getName());
				return t.getCalories() > 300;
				})
			.sorted(comparing(Dish::getCalories))
			.limit(3)
			.map(t -> {
				System.out.println("Mapping: " + t.getName());
				return t.getName();
			})
			.toList();
		
		System.out.println(list);
	}

}
