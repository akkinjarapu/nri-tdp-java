package day032;

public class ExceptionsDemo01 {

	public static void main(String[] args) {
		try {
			int[] a = new int[] {};
			System.out.println(a[0]);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			System.out.println("finally block");
		}
	}

}
