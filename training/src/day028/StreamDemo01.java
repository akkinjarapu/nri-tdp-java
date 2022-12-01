package day028;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo01 {

	public static void main(String[] args) {
		Stream<String> of = 
				Stream.of("Java 19", "lambdas", "streams");
		of.map(String::toUpperCase).forEach(System.out::println);
		
		Stream.of(1,2,3,4,5,6,7,8,9).forEach(System.out::println);
		
		IntStream stream = Arrays.stream(new int[] {1,2,3,4,5,6,7,8,9});
		IntSummaryStatistics summaryStatistics = stream.summaryStatistics();
		System.out.println(summaryStatistics);
		
		Arrays.stream(new String[] {"Java 19", "lambdas", "streams"})
		.forEach(System.out::println);
		
		Stream.iterate(1,  n -> n + 2)
			.limit(5)
			.forEach(System.out::println);
		
		Stream.iterate(new int[] {0,1},  t -> new int[] {t[1], t[0] + t[1]})
		.limit(10)
//		.map(Arrays::toString)
//		.map(t -> "(" + t[0] + ", " + t[1] + ")")
		.map(t -> t[0])
		.forEach(System.out::println);
		
		Stream.generate(Math::random)
			.limit(10)
//			.map(t -> (int) (t * 100))
			.mapToInt(t -> (int) (t * 100))
			.forEach(System.out::println);
	}

}
