package day007;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Prog003 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };

		System.out.println(a[0]);
		
//		System.out.println(a[5]);

		System.out.println(Arrays.toString(a));
		
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		
		for (int i : a) {
			System.out.println(i);
		}
		
		IntStream.of(a).forEach(System.out::println);
	}

}
