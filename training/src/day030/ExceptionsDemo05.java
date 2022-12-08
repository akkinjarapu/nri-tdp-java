package day030;

public class ExceptionsDemo05 {

	public static void main(String[] args) {
		level1(10, 3);
		level1(10, 0);
		level1(10, 5);
	}
	
	public static void level1(int num, int div) {
		System.out.println(num/div);
		System.out.println("NO EXCEPTION OCCURED");
	}

}
