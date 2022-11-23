package day016;

import java.util.List;

public class ImmutableListDemo {

	public static void main(String[] args) {
		List<Object> list = List.of("NRI", 100, 10.68);
		
		System.out.println(list.size());
		
		System.out.println(list.get(0));
		System.out.println(list.get(0).getClass());
		
		System.out.println(list.get(1));
		System.out.println(list.get(1).getClass());
		
		List<Integer> list2 = List.of(10,20,30,40);
		System.out.println(list2);
	}

}
