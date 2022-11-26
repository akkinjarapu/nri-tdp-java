package day024;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class FPDemo07 {

	public static void main(String[] args) {
		Supplier<Integer> supplier = () -> (int) (Math.random() * 100);
		System.out.println(supplier.get());
		
		Function<Integer, List<Integer>> function = (t) -> {
			ArrayList<Integer> integers = new ArrayList<>();
			for(int i = t; i > 0; i--) {
				integers.add(supplier.get());
			}
			
			return integers;
		};
		
		System.out.println(function.apply(5));
		System.out.println(function.apply(10));
	}

}
