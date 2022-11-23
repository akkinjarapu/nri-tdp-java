package day017;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList<Integer> integers = 
				new ArrayList<>(List.of(10,20,30,20,10));
		
		System.out.println(integers);
		
		Iterator<Integer> iterator = integers.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
