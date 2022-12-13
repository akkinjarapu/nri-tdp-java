package day036;

import java.util.HashMap;
import java.util.Map;

public class Roman2IntegerV3 {
	private static final Map<Character, Integer> map = new HashMap<>(7, 1);
	
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
		
		roman = roman.replace("IV", "IIII")
				.replace("IX", "VIIII")
				.replace("XL", "XXXX")
				.replace("XC", "LXXXX")
				.replace("CD", "CCCC")
				.replace("CM", "DCCCC");
		
		int value = 0;
		
		for(int i = 0; i < roman.length(); i++) {
			char ch = roman.charAt(i);
			value +=  map.get(ch);
		}
		
		System.out.println(value);
	}

}
