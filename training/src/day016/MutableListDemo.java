package day016;

import java.util.ArrayList;

public class MutableListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(5);
		
		System.out.println(list.size());
		
		list.add(100);
		System.out.println(list.size());
		System.out.println(list);
		
		list.add(0, 50);
		System.out.println(list.size());
		System.out.println(list);
		
		list.add(1, 75);
		System.out.println(list.size());
		System.out.println(list);
		
		list.add(150);
		System.out.println(list.size());
		System.out.println(list);
		
		list.add(5, 200);
		System.out.println(list.size());
		System.out.println(list);
	}

}
