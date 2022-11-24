package day021;

import java.util.ArrayDeque;

public class QueueDemo {

	public static void main(String[] args) {
		ArrayDeque<Integer> integers = new ArrayDeque<>();
		integers.add(10);
		integers.add(20);
		integers.add(30);
		System.out.println(integers);
		System.out.println(integers.peek());
		System.out.println(integers);
		integers.remove();
		integers.push(40);
		System.out.println(integers);
		integers.removeLast();
		System.out.println(integers);
	}

}
