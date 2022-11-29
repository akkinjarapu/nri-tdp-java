package day025;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class FPDemo03 {
	public static void main(String[] args) {
		BiConsumer<List<String>, List<String>>  consumer = FPDemo03::check;
		consumer.accept(List.of("NRI"), List.of("NRI"));
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		list1.add("NRI");
		list2.add("NR");
		list2.set(0, (list2.get(0) + "i").intern());
		consumer.accept(list1, list2);
	}

	private static void check(List<String> t, List<String> u) {
		if(t.size() != u.size()) {
			System.out.println("NO");
		} else {
			for(int i = 0; i < t.size(); i++) {
				if(!t.get(i).equalsIgnoreCase(u.get(i))) {
					System.out.println("NO");
					return;
				}
			}
			
			System.out.println("YES");
		}
	}
}
