package day030;

public class ExceptionsDemo01 {

	/* checked exception, detected at the time of compilation*/
	@SuppressWarnings("null")
	public static void main(String[] args) {
		String name = null;
		
		System.out.println(name.length());
	}

}
