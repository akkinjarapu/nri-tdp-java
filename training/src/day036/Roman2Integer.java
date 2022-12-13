package day036;

import java.util.HashMap;
import java.util.Map;

public class Roman2Integer {
	private static final Map<Character, Integer> map = new HashMap<>(7);
	
	static {
		map.put('I', 1); 
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
	}

	public static void main(String[] args) {
		String roman = "MMMCMXCIX";
		int value = 0;
		
		for(int i = 0; i < roman.length(); i++) {
			char ch = roman.charAt(i);
			
			if(ch == 'I' && i != roman.length() - 1 && (roman.charAt(i+1) == 'V' || roman.charAt(i+1) == 'X')) {
				value --;
			} else if(ch == 'X' && i != roman.length() - 1 && (roman.charAt(i+1) == 'L' || roman.charAt(i+1) == 'C')) {
				value -= 10;
			} else if(ch == 'C' && i != roman.length() - 1 && (roman.charAt(i+1) == 'D' || roman.charAt(i+1) == 'M')) {
				value -= 100;
			} else {
				value +=  map.get(ch);
			}
			
		}
		
		System.out.println(value);
	}

}
