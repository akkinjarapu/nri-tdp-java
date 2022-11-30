package day027;

public class StreamsDemo08 {

	public static void main(String[] args) {
		/*
		 * sum all dish calories 
		 */
		Integer sum = Dishes.menu
			.stream()
			.map(Dish::getCalories) // Integers
			.reduce(0, (a, b) -> a +b); // unboxing which is not good
		
		System.out.println(sum);
	}

}
