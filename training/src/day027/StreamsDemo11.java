package day027;

import java.util.List;
import java.util.stream.IntStream;

public class StreamsDemo11 {

	public static void main(String[] args) {
		IntStream intStream = IntStream.rangeClosed(1, 10);
		
		List<Integer> list = intStream.boxed().toList();
		
		System.out.println(list);
	}

}
