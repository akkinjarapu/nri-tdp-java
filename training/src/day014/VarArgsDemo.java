package day014;

import java.util.Arrays;

public class VarArgsDemo {
	public static void main(String[] args) {
		int sum = 0;
		
		for(String val : args)
			sum += Integer.parseInt(val);
		
		System.out.println(sum);
		
		VarArgsDemo nw = new VarArgsDemo();
		
		System.out.println(nw.add('A', 10));
		System.out.println(nw.add(10, 20));
		System.out.println(nw.add(10, 20, 30));
		System.out.println(nw.add('D', 10, 20, 30, 40, 50));
	}
	
	
	public int add(int a, int b) {
		System.out.println("2");
		return a + b;
	}
	
	public int add(int a, int b, int c) {
		System.out.println("3");
		return a + b + c;
	}
	
	public int add(char ch, int...a) {
		System.out.println("Array");
		int sum = 0;
		
		for(int val : a)
			sum += val;
		
		return sum;
	}
}
