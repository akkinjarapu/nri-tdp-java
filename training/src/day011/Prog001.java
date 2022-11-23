package day011;

public class Prog001 {

	public static void main(String[] args) {
		String state = "Andhra Pradesh";
		
		System.out.println(state);
		
		char[] charArray = state.toCharArray();
		
		String revState = "";
		
		for(char ch : charArray) {
			revState = ch + revState;
		}
		
		System.out.println(revState);
	}

}
