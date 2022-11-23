package day011;

public class Prog004 {

	public static void main(String[] args) {
		String state = "Andhra Pradesh";
		System.out.println(state);
		
		StringBuilder sb = new StringBuilder(state);
		
		String revState = sb.reverse().toString();
		System.out.println(revState);
	}

}
