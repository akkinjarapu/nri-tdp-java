package day024;

import java.util.function.Function;

public class FPDemo03 {

	public static void main(String[] args) {
		Function<Integer, Integer> function1 = (t) -> t * 10; // f(x)
		Function<Integer, Integer> function2 = (t) -> t + 100;  // g(x)
		Function<Integer, Integer> function3 = (t) -> t + t;  // h(x)
		
		
		System.out.println(function1.apply(10));  // f(10) = 100
		System.out.println(function2.apply(10));  // g(10) = 110
		
		System.out.println(function1.andThen(function2).apply(10)); // g(f(x)) = gof(x) = 200
		System.out.println(function2.andThen(function1).apply(10)); // f(g(x)) = fog(x) = 1100
		
		System.out.println(function3.apply(200)); // ho(gof) = 400
		System.out.println(function2.andThen(function3).apply(100)); // hog(f(10)) = 400
	}

}
