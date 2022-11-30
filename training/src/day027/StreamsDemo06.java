package day027;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class StreamsDemo06 {

	public static void main(String[] args) {
		/*
		 * create a map with dish type and 
		 * associated list of dish names 
		 */
		Map<DishType, List<Dish>> map = Dishes.menu
			.stream()
			.collect(groupingBy(Dish::getType));
		
		System.out.println(map);
	}

}
