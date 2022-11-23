package day018;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo3 {
	
	public static void addSorted(List<Integer> list, int value) {
		int index = Collections.binarySearch(new ArrayList<>(list), value);
		list.add(-index - 1, value);
	}

	public static void main(String[] args) {
		List<Integer> integersList = new LinkedList<>();
		
		for(int value: new int[] {20, 10, 15}) {
			addSorted(integersList, value);
			System.out.println(integersList);
		}
	}

}
