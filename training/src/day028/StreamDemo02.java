package day028;

import java.util.List;
import java.util.stream.DoubleStream;

public class StreamDemo02 {
	public static void main(String[] args) {
		extracted(10, 25, 5)
			.forEach(System.out::println);
	}

	private static List<Integer> extracted(int min, int max, int len) {
		int range = max - min;
		return
		DoubleStream.generate(Math::random)
			.limit(len)
			.mapToInt(t ->  min + (int) (t * range))
			.boxed()
			.toList();
//			.toArray(); // change return type int[], comment above two lines
	}

}
