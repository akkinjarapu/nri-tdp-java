package day022;

import java.util.ArrayList;

public class FPDemo12 {

	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList<>();
		apples.add(new Apple("Green", 50));
		apples.add(new Apple("Green", 150));
		apples.add(new Apple("Red", 80));
		apples.add(new Apple("Red", 130));
		apples.add(new Apple("Green", 78));

		ArrayList<Apple> greenApples = filterApples(apples, 
				apple -> apple.isColor("Green")
				);
		System.out.println(greenApples);

		ArrayList<Apple> redApples = filterApples(apples, 
				apple -> apple.getColor().equals("Red")
		);
		System.out.println(redApples);

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
