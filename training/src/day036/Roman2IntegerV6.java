package day036;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Roman2IntegerV6 {
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
		String[] romans = new String[] {"MMMCMXCIX", "DXC"};
		
		Arrays.stream(romans)
			.map(s -> s.replace("IV", "IIII"))
			.map(s -> s.replace("IX", "VIIII"))
			.map(s -> s.replace("XL", "XXXX"))
			.map(s -> s.replace("XC", "LXXXX"))
			.map(s -> s.replace("CD", "CCCC"))
			.map(s -> s.replace("CM", "DCCCC"))
			.mapToInt(s -> s.chars().map(c -> map.get((char) c)).sum())
			.forEach(s -> System.out.println(s));
	}
}
