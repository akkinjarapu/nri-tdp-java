package day022;

import java.util.ArrayList;
import java.util.function.Predicate;

public class FPDemo14 {

	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList<>();
		apples.add(new Apple("Green", 50));
		apples.add(new Apple("Green", 150));
		apples.add(new Apple("Red", 80));
		apples.add(new Apple("Red", 130));
		apples.add(new Apple("Green", 78));

		ArrayList<Apple> filteredApples = filter(apples, apple -> apple.isColor("Green")	);
		System.out.println(filteredApples);

		filteredApples = filter(apples, apple -> apple.isColor("Red")	);
		System.out.println(filteredApples);
		
		filteredApples = filter(apples, apple -> apple.isWeightInRange(0, 51)	);
		System.out.println(filteredApples);
		
		filteredApples = filter(apples, apple -> 
									apple.isColor("Green") && apple.isWeightInRange(100, 151)	);
		System.out.println(filteredApples);

	}

	private static ArrayList<Apple> filter(ArrayList<Apple> apples, Predicate<Apple> predicate) {
		ArrayList<Apple> filteredApples = new ArrayList<>(); 
		for (Apple apple : apples) {
			if (predicate.test(apple)) {
				filteredApples.add(apple);
			}
		}
		return filteredApples;
	}

}
