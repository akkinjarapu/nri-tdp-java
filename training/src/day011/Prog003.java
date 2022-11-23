package day011;

public class Prog003 {

	public static void main(String[] args) {
		String state = "Andhra Pradesh";
		System.out.println(state);
		
		char[] charArray = state.toCharArray();
		
		for(int left = 0, right = charArray.length - 1, temp; 
				left < right; 
				left++, right--) {
			temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = (char) temp;
		}
		
		String revState = String.valueOf(charArray);
		System.out.println(revState);
	}

}
