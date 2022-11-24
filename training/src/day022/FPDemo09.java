package day022;

import java.util.ArrayList;

public class FPDemo09 {

	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList<>();
		apples.add(new Apple("Green", 50));
		apples.add(new Apple("Green", 150));
		apples.add(new Apple("Red", 80));
		apples.add(new Apple("Red", 130));
		apples.add(new Apple("Green", 78));
		
		ArrayList<Apple> greenApples = filterApples(apples, "Green");
		System.out.println(greenApples);
		
		ArrayList<Apple> redApples =  filterApples(apples, "Red");
		System.out.println(redApples);
		
		ArrayList<Apple> smallApples =  filterApples(apples, 0, 51);
		System.out.println(smallApples);
		
		ArrayList<Apple> mediumApples =  filterApples(apples, 51, 101);
		System.out.println(mediumApples);
		
		ArrayList<Apple> bigApples =  filterApples(apples, 101, 501);
		System.out.println(bigApples);
		
		ArrayList<Apple> bigGreenApples =  filterApples(apples, "Green", 101, 501);
		System.out.println(bigGreenApples);
	}

	private static ArrayList<Apple> filterApples(ArrayList<Apple> apples, String color) {
		return filterApples(apples, color, 0, 0);
	}
	
	private static ArrayList<Apple> filterApples(ArrayList<Apple> apples, 
			int minWeight, int maxWeight) {
		return filterApples(apples, "", minWeight, maxWeight);
	}
	
	private static ArrayList<Apple> filterApples(ArrayList<Apple> apples, String color, 
			int minWeight, int maxWeight) {
		ArrayList<Apple> filteredApples = new ArrayList<>();
		for(Apple apple : apples) {
			if((color.isBlank() || color.equals(apple.getColor())) && 
					(maxWeight == 0 || (apple.getWeight() >= minWeight && apple.getWeight() < maxWeight))) {
				filteredApples.add(apple);
			}
		}
		return filteredApples;
	}

}



