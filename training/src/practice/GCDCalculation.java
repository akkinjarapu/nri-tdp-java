package practice;

public class GCDCalculation {
	private static int compute(int a, int b ) {
		if (a < 0 && b < 0)
			return compute(-a, -b);
		
		if(a < 0)
			return compute (-a, b);
		
		if(b < 0)
			return compute (a, -b);
		
		if(a == 0 && b == 0)
			return 0;
		
		if(a == 0)
			return b;
		
		if(b == 0)
			return a;
		
		if(a == 1 || b == 1)
			return 1;
		
		if(a > b)
			return compute(b, a);
		
		return compute(b % a, a);
	}
	
	private static int compute1(int a, int b ) {
		
		if(a < 0)
			a = -a;
		
		if(b < 0)
			b = -b;
		
		if(a == 0 && b == 0)
			return 0;
		
		if(a == 0)
			return b;
		
		if(b == 0)
			return a;
		
		if(a == 1 || b == 1)
			return 1;
		
		if(a > b) {
			int t = a;
			a = b;
			b = t;
		}
		
		while(a != 0) {
			int r = b % a;
			b = a;
			a = r;
		}
		
		return b;
	}
	
//	private static int compute1(int a, int b, int c) {
//		return compute1(compute1(a, b), c);
//	}
	
	private static int compute1(int...a) {
		int v = a[0];
		for(int i = 0; i < a.length; i++) {
			v = compute1(v, a[i]);
		}
		return v;
	}

	public static void main(String[] args) {
		System.out.println(compute(10, 0));
		System.out.println(compute(0, 8));
		
		System.out.println(compute(10, 1));
		System.out.println(compute(1, 8));
		
		System.out.println(compute(10, 8));
		System.out.println(compute(8, 10));
		
		System.out.println(compute(0, 0));
		
		System.out.println(compute(-10, -8));
		System.out.println(compute(-8, 10));
		System.out.println(compute(-10, 8));
		
		System.out.println("======================");
		System.out.println(compute1(10, 8));
		
		System.out.println("======================");
		System.out.println(compute1(11, 8));
		
		System.out.println("======================");
		System.out.println(compute1(10, 8, 12));
		System.out.println(compute1(10, 8, 12, 5));
		
	}

}
