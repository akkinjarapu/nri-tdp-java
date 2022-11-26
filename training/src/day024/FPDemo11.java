package day024;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class FPDemo11 {

	public static void main(String[] args) {
		UnaryOperator<String> operator1 = (t) -> new StringBuilder(t).reverse().toString();
		System.out.println(operator1.apply("ABCDEF"));
		System.out.println(operator1.andThen(operator1).apply("ABCDEF"));
		
		BinaryOperator<String> operator2 = (t, u) -> t + u;
		System.out.println(operator2.apply("an", "and"));
	}

}
