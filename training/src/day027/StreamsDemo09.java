package day027;

public class StreamsDemo09 {

	public static void main(String[] args) {
		/*
		 * sum all dish calories 
		 */
		int sum = Dishes.menu
			.stream()
			.mapToInt(Dish::getCalories)
//			.sum();
//			.map(Dish::getCalories) // Integers
			.sum(); //cant't apply on integers
		
		System.out.println(sum);
	}

}
