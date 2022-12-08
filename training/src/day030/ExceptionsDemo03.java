package day030;

public class ExceptionsDemo03 {

	public static void main(String[] args) {
		level1(10);
	}
	
	public static void level1(int num) {
		System.out.println(num/0);
	}

}
