package day032;

@SuppressWarnings("serial")
public class ExceptionsWithArguments extends RuntimeException {
	private int length;
	private String name;
	
	public ExceptionsWithArguments(int length, String name) {
		this(name, length);
	}
	
	public ExceptionsWithArguments(String name, int length) {
		this.length = length;
		this.name = name;
	}

	@Override
	public String getMessage() {
		return name + " with length =" + name.length() + " is not equal to " + length;
	}
	
}
