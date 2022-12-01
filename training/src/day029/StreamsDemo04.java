package day029;

import static java.util.stream.Collectors.reducing;

public class StreamsDemo04 {

	public static void main(String[] args) {
		Integer sum = Dishes.MENU
			.stream()
			.collect(reducing(0, Dish::getCalories, (i, j) -> i + j));
		
		System.out.println(sum);
		
		String result = Dishes.MENU
				.stream()
				.collect(reducing("", Dish::getName, (i, j) -> i + ", " + j));
			
			System.out.println(result);
	}

}
