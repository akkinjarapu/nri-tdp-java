package day013;

public class FrequencyCounts {
	
	public static void main(String[] args) {
		String name = "an ANd";
		int[] uc = new int[58];
		
		for(int i = name.length() - 1; i >= 0; i--) {
			if((name.charAt(i) >= 65 && name.charAt(i) <= 90) || 
					(name.charAt(i) >= 90 && name.charAt(i) <= 122)) {
				uc[name.charAt(i) - 65]++;
			}
		}
		
		for(int i = 0; i < uc.length; i++) {
			if (uc[i] != 0) {
				System.out.println((char)(i+65) + " => " + uc[i]);
			}
		}
	}
}
