package day024;

import java.util.ArrayList;
import java.util.function.Supplier;

public class FPDemo05 {

	public static void main(String[] args) {
		Supplier<Integer> supplier = () -> 10;
		System.out.println(supplier.get());
		
		supplier = () -> (int) (Math.random() * 100);
		System.out.println(supplier.get());
		
		ArrayList<Integer> integers = new ArrayList<>();
		for(int i = 10; i > 0; i--) {
			integers.add(supplier.get());
		}

		System.out.println(integers);
	}

}
