package day027;

import java.util.List;
import java.util.stream.IntStream;

public class StreamsDemo15 {

	public static void main(String[] args) {
		/* Pythagorean tripples */
		
		List<Triple> list = IntStream.range(1, 25).boxed()
			.flatMap(a -> IntStream.range(1, 25)
										.filter(b -> Math.sqrt(a * a + b * b) % 1 == 0)
										.mapToObj(b -> new Triple(a, b, Math.sqrt(a * a + b * b)))
										)
			.toList();
		
		System.out.println(list);
	}

}
