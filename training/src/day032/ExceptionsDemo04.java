package day032;

import java.util.InputMismatchException;

public class ExceptionsDemo04 {

	public static void main(String[] args) {
		try {
			int a = 10;
			if ((a & 1) == 0)
				throw new InputMismatchException("value is not an odd number " + a);
		}  catch (Exception e) {
			e.printStackTrace();
		}
	}

}
