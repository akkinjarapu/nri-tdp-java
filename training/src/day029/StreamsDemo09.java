package day029;

import static java.util.stream.Collectors.groupingBy;

import java.util.List;
import java.util.Map;

public class StreamsDemo09 {

	public static void main(String[] args) {
		Map<DishType, Map<CalorieType, List<Dish>>> dishesByCaloryType = Dishes.MENU
				.stream()
				.collect(groupingBy(Dish::getType, groupingBy(StreamsDemo09::getCalorieType)));
		
		dishesByCaloryType.forEach((key, value) -> System.out.println(key + " -> " + value));
		
	}

	private static CalorieType getCalorieType(Dish d) {
		if(d.getCalories() <= 300)
			return CalorieType.LOW;
		else if(d.getCalories() <= 500)
			return CalorieType.NORMAL;
		else
			return CalorieType.HIGH;
	}
	
	private static enum CalorieType {LOW, NORMAL, HIGH}
}

