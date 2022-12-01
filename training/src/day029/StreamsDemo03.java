package day029;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

public class StreamsDemo03 {

	public static void main(String[] args) {
		IntSummaryStatistics statistics = Dishes.MENU
			.stream()
			.collect(Collectors.summarizingInt(Dish::getCalories));
		
		System.out.println(statistics);
	}

}
