package day022;

import java.util.ArrayList;

public class FPDemo02 {

	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList<>();
		apples.add(new Apple("Green", 50));
		apples.add(new Apple("Green", 150));
		apples.add(new Apple("Red", 80));
		apples.add(new Apple("Red", 130));
		apples.add(new Apple("Green", 78));
		
		ArrayList<Apple> greenApples = filterGreenApples(apples);
		
		System.out.println(greenApples);
	}

	private static ArrayList<Apple> filterGreenApples(ArrayList<Apple> apples) {
		ArrayList<Apple> greenApples = new ArrayList<>();
		for(Apple apple : apples) {
			if("Green".equals(apple.getColor())) {
				greenApples.add(apple);
			}
		}
		return greenApples;
	}

}



