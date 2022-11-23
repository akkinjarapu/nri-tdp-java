package day016;

import java.util.ArrayList;
import java.util.List;

public class MutableListDemo2 {

	public static void main(String[] args) {
		List<Integer> list = List.of(10,20,30,40);
		
		ArrayList<Integer> integers = 
				new ArrayList<>();
		integers.addAll(list);
		integers.add(50);
		
		System.out.println(integers);
	}

}
