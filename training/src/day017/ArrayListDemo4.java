package day017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo4 {

	public static void main(String[] args) {
		ArrayList<Integer> integers = 
				new ArrayList<>(List.of(10, 30, 20, 5, 15, 10));
		System.out.println(integers);
		
//		integers.sort((o1, o2) -> o1 - o2);
//		System.out.println(integers);
//		
//		integers.sort((o1, o2) -> o2 - o1);
//		System.out.println(integers);
		
		Collections.sort(integers);
		System.out.println(integers);
		
		integers.retainAll(List.of(10, 15));
		System.out.println(integers);
	}

}
