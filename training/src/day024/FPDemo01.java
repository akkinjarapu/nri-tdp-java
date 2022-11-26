package day024;

import java.util.List;
import java.util.function.Function;

public class FPDemo01 {
	public static <T, R> List<R> map(List<T> objects, Function<T, R> function) {
		return objects.stream().map(function).toList();
	}
	
	public static void main(String[] args) {
		System.out.println(map(List.of(1,2,3,4,5), (t) -> (t&1) == 0 ? "Even" : "Odd"));
	}

}
