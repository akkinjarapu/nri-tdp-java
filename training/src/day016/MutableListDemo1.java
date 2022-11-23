package day016;

import java.util.ArrayList;

public class MutableListDemo1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(5);
		
		list.add(10); list.add(20); list.add(30);
		
//		list.add(40); list.add(50); list.add(60);
		
		System.out.println(list);
		
		list.addAll(list);
		System.out.println(list);
		
		list.addAll(1, list);
		System.out.println(list);
	}

}
