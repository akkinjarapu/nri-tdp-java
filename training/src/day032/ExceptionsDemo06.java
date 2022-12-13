package day032;

public class ExceptionsDemo06 {

	public static void main(String[] args) throws NotAnOddNumberException {
		int a = 10;
		if ((a & 1) == 0)
			throw new NotAnOddNumberException();
	}

}
