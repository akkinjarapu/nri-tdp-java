package day022;

import java.util.ArrayList;

public class FPDemo13 {

	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList<>();
		apples.add(new Apple("Green", 50));
		apples.add(new Apple("Green", 150));
		apples.add(new Apple("Red", 80));
		apples.add(new Apple("Red", 130));
		apples.add(new Apple("Green", 78));

		ArrayList<Apple> filteredApples = filterApples(apples, apple -> apple.isColor("Green")	);
		System.out.println(filteredApples);

		filteredApples = filterApples(apples, apple -> apple.isColor("Red")	);
		System.out.println(filteredApples);
		
		filteredApples = filterApples(apples, apple -> apple.isWeightInRange(0, 51)	);
		System.out.println(filteredApples);
		
		filteredApples = filterApples(apples, apple -> 
									apple.isColor("Green") && apple.isWeightInRange(100, 151)	);
		System.out.println(filteredApples);

	}

	private static ArrayList<Apple> filterApples(ArrayList<Apple> apples, ApplePredicate predicate) {
		ArrayList<Apple> filteredApples = new ArrayList<>();
		for (Apple apple : apples) {
			if (predicate.test(apple)) {
				filteredApples.add(apple);
			}
		}
		return filteredApples;
	}

}
