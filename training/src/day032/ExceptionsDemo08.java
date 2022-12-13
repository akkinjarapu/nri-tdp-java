package day032;

public class ExceptionsDemo08 {

	public static void main(String[] args) {
		try {
			int a = 11;
			if ((a & 1) == 1)
				throw new NotAnEvenNumberException();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
