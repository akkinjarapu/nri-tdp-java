package day030;

public class ExceptionsDemo04 {

	public static void main(String[] args) {
		level1(10);
	}
	
	public static void level1(int num) {
		level2(num);
	}
	
	private static void level2(int num) {
		level4(num);
	}

	public static void level4(int num) {
		System.out.println(num/0);
	}

}
