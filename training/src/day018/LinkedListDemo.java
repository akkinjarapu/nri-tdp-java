package day018;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> integers = 
				new LinkedList<>(List.of(10, 20, 30));
		System.out.println(integers);
		
		System.out.println(integers.get(2));
		
		System.out.println(integers.element());
		
		List<Integer> arrayList = Collections.unmodifiableList(integers);
		System.out.println(arrayList);
		
		integers.add(40);
		System.out.println(integers);
		System.out.println(arrayList);
	}

}
