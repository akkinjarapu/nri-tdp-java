package practice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PrimeNumberGeneration {
	private static boolean isPrime(int num) {
		int d = (int) Math.sqrt(num);
		for(int i = 2; i <= d; i++) {
			if(num % i == 0)
				return false;
		}
		
		return true;
	}
	
	private static int[] generate(int start, int end) {
		return
		IntStream.range(start, end)
				.filter(PrimeNumberGeneration::isPrime)
				.toArray();
	}
	
	private static int[] generate(int start, int end, int count) {
		return
		IntStream.range(start, end)
				.filter(PrimeNumberGeneration::isPrime)
				.limit(count)
				.toArray();
	}

	public static void main(String[] args) {
		System.out.println(isPrime(11));
		System.out.println(isPrime(9));
		
		System.out.println(Arrays.toString(generate(50, 100)));
		System.out.println(Arrays.toString(generate(50, 100, 2)));
	}

}
