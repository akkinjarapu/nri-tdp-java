package day024;

import java.util.function.Function;

public class FPDemo04 {

	public static void main(String[] args) {
		Function<Integer, Integer> function1 = (t) -> t * 10; // f(x)
		Function<Integer, Integer> function2 = (t) -> t + 100; // g(x)

		// gof
		System.out.println(function1.andThen(function2).apply(10));
		System.out.println(function2.compose(function1).apply(10));

		// fog
		System.out.println(function2.andThen(function1).apply(10));
		System.out.println(function1.compose(function2).apply(10));
	}

}
