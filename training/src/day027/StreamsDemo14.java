package day027;

import java.util.List;

public class StreamsDemo14 {

	public static void main(String[] args) {
		/*Given two lists of numbers, 
		 * how would you return all pairs of numbers whose sum is divisible by 3? 
		 * For example, given a list [1, 2, 3] and a list [3, 4] 
		 * you should return [(2, 4), (3, 3)]. 
		 */
		
		List<Integer> list1 = List.of(1, 2, 3);
		List<Integer> list2 = List.of(3, 4);
		
		List<Point> list = list1.stream()
			.flatMap(i -> list2.stream().filter(j -> (i + j) % 3 == 0).map(j -> new Point(i, j)))
			.toList();
		
		System.out.println(list);
	}

}
