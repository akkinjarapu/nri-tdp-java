package day029;

import static java.util.stream.Collectors.partitioningBy;

import java.util.List;
import java.util.Map;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class PrimeNumbers {
	private static boolean isPrime(Integer num) {
		int k = (int) Math.sqrt(num);
		
		for(int d = 2; d <= k; d++) {
			if (num % d == 0)
				return false;
		}
		
		return true;
	}

	public static void main(String[] args) {
		Map<Boolean, List<Integer>> partition = DoubleStream.generate(Math::random)
					.limit(5)
					.mapToObj(t -> (int) (t * 100) + 1)
					.collect(partitioningBy(t -> isPrime(t)));
		
		System.out.println(partition);
		
		IntStream.rangeClosed(1, 100)
			.filter(PrimeNumbers::isPrime)
			.forEach(System.out::println);
	}

}
