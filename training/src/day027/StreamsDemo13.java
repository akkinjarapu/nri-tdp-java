package day027;

import java.util.List;

public class StreamsDemo13 {

	public static void main(String[] args) {
		/*Given two lists of numbers, 
		 * how would you return all pairs of numbers? 
		 * For example, given a list [1, 2, 3] and a list [3, 4] 
		 * you should return [(1, 3), (1, 4), (2, 3), (2, 4), (3, 3), (3, 4)]. 
		 */
		
		List<Integer> list1 = List.of(1, 2, 3);
		List<Integer> list2 = List.of(3, 4);
		
		List<Point> list = list1.stream()
			.flatMap(i -> list2.stream().map(j -> new Point(i, j)))
			.toList();
		
		System.out.println(list);
	}

}
