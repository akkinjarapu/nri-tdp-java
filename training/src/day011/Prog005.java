package day011;

public class Prog005 {

	public static void main(String[] args) {
		String state = "LiRIL";
		System.out.println(state);
		
		StringBuilder sb = new StringBuilder(state);
		
		String revState = sb.reverse().toString();
		System.out.println(revState);
		
		System.out.println(state.equalsIgnoreCase(revState) ? 
				"PALINDROME" : "NOT A PALINDROME");
	}

}
