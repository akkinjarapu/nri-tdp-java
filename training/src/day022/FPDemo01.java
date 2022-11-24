package day022;

import java.util.ArrayList;

public class FPDemo01 {

	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList<>();
		apples.add(new Apple("Green", 50));
		apples.add(new Apple("Green", 150));
		apples.add(new Apple("Red", 80));
		apples.add(new Apple("Red", 130));
		apples.add(new Apple("Green", 78));
		
		System.out.println(apples);
		for(Apple apple: apples) {
			System.out.println(apple);
		}
		apples.forEach(apple ->System.out.println(apple));
	}

}






