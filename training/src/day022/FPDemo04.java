package day022;

import java.util.ArrayList;

public class FPDemo04 {

	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList<>();
		apples.add(new Apple("Green", 50));
		apples.add(new Apple("Green", 150));
		apples.add(new Apple("Red", 80));
		apples.add(new Apple("Red", 130));
		apples.add(new Apple("Green", 78));
		
		ArrayList<Apple> greenApples = filterApplesByColor(apples, "Green");
		System.out.println(greenApples);
		
		ArrayList<Apple> redApples =  filterApplesByColor(apples, "Red");
		System.out.println(redApples);
	}

	private static ArrayList<Apple> filterApplesByColor(ArrayList<Apple> apples, String color) {
		ArrayList<Apple> coloredApples = new ArrayList<>();
		for(Apple apple : apples) {
			if(color.equals(apple.getColor())) {
				coloredApples.add(apple);
			}
		}
		return coloredApples;
	}

}



