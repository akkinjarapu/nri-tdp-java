package day005;

public class Prog002 {

	public static void main(String[] args) {
		int a = Integer.parseInt("105");
		System.out.println(a);
		
		long b = Long.parseLong("105");
		System.out.println(b);
		
		a = Integer.parseInt("123", 19);
		System.out.println(a);
		
		a = Integer.parseInt("12345679", 1, 3, 8);
		System.out.println(a);
	}

}
