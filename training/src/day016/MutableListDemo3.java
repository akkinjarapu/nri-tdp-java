package day016;

import java.util.ArrayList;
import java.util.List;

public class MutableListDemo3 {

	public static void main(String[] args) {
		List<Integer> list = List.of(10,20,30,40);
		
		ArrayList<Integer> integers = 
				new ArrayList<>(list);
		
		System.out.println(integers);
		
		integers.set(0, 100);
		System.out.println(integers);
		System.out.println(list);
		
//		integers.clear();
//		System.out.println(integers.size());
		
		System.out.println(integers.contains(10));
		System.out.println(integers.containsAll(List.of(10, 30)));
		System.out.println(integers.containsAll(List.of(20, 40)));

		
	}

}
