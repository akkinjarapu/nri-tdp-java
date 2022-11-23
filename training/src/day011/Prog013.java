package day011;

public class Prog013 {
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public int mul(int a, int b) {
		return a * b;
	}
	
	public int add(int a, int b, int c) {
//		return a + b + c;
		return add(add(a, b), c);
	}

	public static void main(String[] args) {
		Prog013 obj = new Prog013();
		System.out.println(obj.add(10, 20));
		System.out.println(obj.mul(10, 20));
		System.out.println(obj.add(10, 20, 30));
	}

}
