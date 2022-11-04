package day008;

import java.util.stream.IntStream;

public class Prog003 {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		
		int sum = 0;
		
		for(int i : a) {
			sum += i;
		}
		
		System.out.println(IntStream.of(a).sum());
		
		System.out.println(sum);

	}

}
