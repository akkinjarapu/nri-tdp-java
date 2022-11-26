package day024;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class FPDemo06 {

	public static void main(String[] args) {
		Supplier<List<Integer>> supplier = () -> {
			ArrayList<Integer> integers = new ArrayList<>();
			for(int i = 10; i > 0; i--) 
				integers.add((int) (Math.random() * 100));
			return integers;
		};
		System.out.println(supplier.get());
	}

}
