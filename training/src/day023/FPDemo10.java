package day023;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FPDemo10 {
	public static <T, R> List<R> map(List<T> objects, Function<T, R> function) {
		List<R> result = new ArrayList<>();
		for(T object: objects) {
			result.add(function.apply(object));
		}
		return result;
	}

	public static void main(String[] args) {
		Function<String, Integer> function = (t) -> t.length();
		System.out.println(function.apply("NRI TDP"));
		
		System.out.println(map(List.of("NRI", "TDP", "Mangalagiri"), function));
		System.out.println(map(List.of(1,2,3,4,5), (t) -> t&1));
		System.out.println(map(List.of(1,2,3,4,5), (t) -> (t&1) == 0 ? "Even" : "Odd"));
	}

}
