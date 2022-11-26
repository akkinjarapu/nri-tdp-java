package day024;

import java.util.List;

public class FPDemo02 {
	public static void main(String[] args) {
		List<String> list = List.of(1,2,3,4,5)
										.stream()
										.map((t) -> (t&1) == 0 ? "Even" : "Odd")
										.toList();
		System.out.println(list);
	}

}
