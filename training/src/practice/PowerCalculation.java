package practice;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PowerCalculation {
	private static int calculate1(int a, int m) {
		int prod = 1;
		for(; m > 0; m--)
			prod *= a;
		return prod;
	}
	
	private static int calculate2(int a, int m) {
		return 
		IntStream.range(0, m)
					.reduce(1, (u, v) -> u * a);
	}
	
	private static int calculate3(int a, int m) {
		if (m == 0) 
			return 1;
		
		int p = calculate3(a, m >> 1);
		p *= p;
		if((m & 1) != 0)
			p *= a;
		
		return p;
	}
	
	private static int calculate4(int a, int m) {
		int prod = 1;
		
		while(m != 0) {
			if((m & 1) != 0)
				prod  *= a;
			a *= a;
			m >>= 1;
		}
		
		return prod;
	}
	
	private static int calculate5(int a, int m) {
		return
		Stream.iterate(new int[] {m, a}, p -> p[0] > 0, p -> new int[] {p[0] >> 1, p[1] * p[1]})
				.filter(p -> (p[0] & 1) != 0)
				.map(p -> p[1])
				.reduce(1, (u, v) -> u * v);
	}

	public static void main(String[] args) {
		var a = 3;
		var m = 4;
		
		System.out.println(calculate1(a, m));
		System.out.println(calculate2(a, m));
		System.out.println(calculate3(a, m));
		System.out.println(calculate4(a, m));
		System.out.println(calculate5(a, m));
	}

}
