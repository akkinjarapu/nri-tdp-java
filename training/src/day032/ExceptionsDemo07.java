package day032;

public class ExceptionsDemo07 {

	public static void main(String[] args) {
		int a = 11;
		if ((a & 1) == 1)
			throw new NotAnEvenNumberException();
	}

}
