package day032;

@SuppressWarnings("serial")
public class NotAnOddNumberException extends Exception {

	@Override
	public String getMessage() {
		return "value is not an odd number";
	}

}
