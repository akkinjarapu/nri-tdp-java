package day027;

import java.util.List;
import java.util.stream.IntStream;

public class StreamsDemo12 {

	public static void main(String[] args) {
		IntStream intStream = IntStream.range(1, 10);
		
		List<Integer> list = intStream.boxed().toList();
		
		System.out.println(list);
	}

}
