package day032;

public class ExceptionsDemo05 {

	public static void main(String[] args) {
		try {
			int a = 10;
			if ((a & 1) == 0)
				throw new NotAnOddNumberException();
		}  catch (Exception e) {
			e.printStackTrace();
		}
	}

}
