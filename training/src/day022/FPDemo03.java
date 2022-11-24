package day022;

import java.util.ArrayList;

public class FPDemo03 {

	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList<>();
		apples.add(new Apple("Green", 50));
		apples.add(new Apple("Green", 150));
		apples.add(new Apple("Red", 80));
		apples.add(new Apple("Red", 130));
		apples.add(new Apple("Green", 78));
		
		ArrayList<Apple> greenApples = filterGreenApples(apples);
		System.out.println(greenApples);
		
		ArrayList<Apple> redApples = filterRedApples(apples);
		System.out.println(redApples);
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
	
	private static ArrayList<Apple> filterRedApples(ArrayList<Apple> apples) {
		ArrayList<Apple> redApples = new ArrayList<>();
		for(Apple apple : apples) {
			if("Red".equals(apple.getColor())) {
				redApples.add(apple);
			}
		}
		return redApples;
	}

}



