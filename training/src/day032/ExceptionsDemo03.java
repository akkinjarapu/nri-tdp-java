package day032;

public class ExceptionsDemo03 {

	public static void main(String[] args) {
		try {
			int[] a = new int[] {10};
			System.out.println(a[0]);
		}  finally {
			System.out.println("finally block");
		}
	}

}
