package day030;

import static java.util.stream.Collectors.partitioningBy;

import java.util.List;
import java.util.Map;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class PrimeNumbers {
	private static boolean isPrime(Integer num) {
		return
		IntStream.rangeClosed(2, (int) Math.sqrt(num))
					.noneMatch(d -> num % d == 0);
	}

	public static void main(String[] args) {
		Map<Boolean, List<Integer>> partition = DoubleStream.generate(Math::random)
					.limit(5)
					.mapToObj(t -> (int) (t * 100) + 1)
					.collect(partitioningBy(t -> isPrime(t)));
		
		System.out.println(partition);
	}

}
