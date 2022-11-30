package day027;

import java.util.List;
import java.util.stream.IntStream;

public class StreamsDemo17 {

	public static void main(String[] args) {
		/* Pythagorean tripples */
		
		List<Triple> list = IntStream.range(1, 25).boxed()
			.flatMap(a -> IntStream.range(a, 25)
										.mapToObj(b -> new Triple(a, b, Math.sqrt(a * a + b * b)))
										.filter(b -> b.getZ() % 1 == 0)
										)
			.toList();
		
		System.out.println(list);
	}

}
