package day011;

public class Prog002 {

	public static void main(String[] args) {
		String state = "Andhra Pradesh";
		
		System.out.println(state);
		
		char[] charArray = state.toCharArray();
		
		String revState = "";
		
		for(int index = charArray.length - 1; index >= 0; index--) {
			revState += charArray[index];
		}
		
		System.out.println(revState);
	}

}
