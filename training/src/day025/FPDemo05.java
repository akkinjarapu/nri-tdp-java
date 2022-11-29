package day025;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class FPDemo05 {
	
	public static List<String>  combine(List<String> t, List<String> u) {
		ArrayList<String> list = new ArrayList<>(t);
		list.addAll(u);
		return list;
	}
	
	public static void main(String[] args) {
		BiFunction<List<String>, List<String>, List<String>> biFunction = FPDemo05::combine;
		System.out.println(biFunction.apply(List.of("NRI"), List.of("TDP")));
	}

}
