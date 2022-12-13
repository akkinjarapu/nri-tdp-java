package day036;

import java.util.HashMap;
import java.util.Map;

public class Roman2IntegerV2 {
	private static final Map<Character, Integer> map = new HashMap<>(13, 1);
	
	static {
		map.put('I', 1); 
		map.put('A', 4); 
		map.put('V', 5);
		map.put('B', 9);
		map.put('X', 10);
		map.put('E', 40); 
		map.put('L', 50);
		map.put('F', 90);
		map.put('C', 100);
		map.put('G', 400);
		map.put('D', 500);
		map.put('H', 900);
		map.put('M', 1000);
	}

	public static void main(String[] args) {
		String roman = "MMMCMXCIX";
		
		roman = roman.replace("IV", "A")
				.replace("IX", "B")
				.replace("XL", "E")
				.replace("XC", "F")
				.replace("CD", "G")
				.replace("CM", "H");
		
		int value = 0;
		
		for(int i = 0; i < roman.length(); i++) {
			char ch = roman.charAt(i);
			value +=  map.get(ch);
		}
		
		System.out.println(value);
	}

}
