package day018;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		List<Integer> integersList = new LinkedList<>();
		List<Integer> integersArray = Collections.unmodifiableList(integersList);
		
		integersList.add(20);
		integersList.add(10);
		integersList.sort((o1, o2) -> o1 - o2);
		System.out.println(integersList);
		System.out.println(integersArray);
		
		integersList.add(15);
		integersList.sort((o1, o2) -> o1 - o2);
		System.out.println(integersList);
		System.out.println(integersArray);
		
		System.out.println(Collections.binarySearch(integersList, 30));
		System.out.println(Collections.binarySearch(integersArray, 30));
		System.out.println(integersList.getClass());
		System.out.println(integersArray.getClass());
	}

}
