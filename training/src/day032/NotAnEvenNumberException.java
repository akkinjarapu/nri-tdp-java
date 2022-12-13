package day032;

@SuppressWarnings("serial")
public class NotAnEvenNumberException extends RuntimeException {

	@Override
	public String getMessage() {
		return "value is not an even number";
	}

}
