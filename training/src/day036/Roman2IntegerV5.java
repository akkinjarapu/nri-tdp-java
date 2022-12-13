package day036;

import java.util.HashMap;
import java.util.Map;

public class Roman2IntegerV5 {
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
		
		int value = toInteger(roman);
		
		System.out.println(value);
	}

	private static int toInteger(String roman) {
		roman = roman.replace("IV", "IIII")
				.replace("IX", "VIIII")
				.replace("XL", "XXXX")
				.replace("XC", "LXXXX")
				.replace("CD", "CCCC")
				.replace("CM", "DCCCC");
		
		int value = 
		
		roman.chars()
			.mapToObj(c -> (char) c)
			.mapToInt(c -> map.get(c)).sum();
		return value;
	}

}
