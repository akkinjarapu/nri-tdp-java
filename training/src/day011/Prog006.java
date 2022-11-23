package day011;

public class Prog006 {

	public static void main(String[] args) {
		String state = "ABCCBA";
		System.out.println(state);
		
		int i = 0, j = state.length()-1;
		
		for(; i < j; i++, j--) {
			if(state.charAt(i) != state.charAt(j)) {
				System.out.println("NOT A PALINDROME");
				break;
			}
		}
		
		if(i >= j) {
			System.out.println("PALINDROME");
		}
	}

}
