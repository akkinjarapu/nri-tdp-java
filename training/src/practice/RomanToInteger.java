package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.regex.Pattern;

public class RomanToInteger {
	private static final HashMap<String, Integer> MAP = new HashMap<>(13, 1);
	
	static {
		MAP.put("I", 1);
		MAP.put("V", 5);
		MAP.put("X", 10);
		MAP.put("L", 50);
		MAP.put("C", 100);
		MAP.put("D", 500);
		MAP.put("M", 1000);
		
		/* not required for convert1, remove the following 
		 * and change constructor argument from 13 to 7 */
		MAP.put("A", 4);
		MAP.put("B", 9);
		MAP.put("E", 40);
		MAP.put("F", 90);
		MAP.put("G", 400);
		MAP.put("H", 900);
	}
	
	// Memory Efficient but not time efficient
	private static int convert1(String roman) {
		roman = roman.replace("IV", "IIII")
							.replace("IX", "VIIII")
							.replace("XL", "XXXX")
							.replace("XC", "LXXXX")
							.replace("CD", "CCCC")
							.replace("CM", "DCCCC");
		
		return
		Arrays.stream(roman.split(""))
				.mapToInt(MAP::get).sum();
	}
	
	// time efficient, but not memory efficient
	private static int convert2(String roman) {
		roman = roman.replace("IV", "A")
							.replace("IX", "B")
							.replace("XL", "E")
							.replace("XC", "F")
							.replace("CD", "G")
							.replace("CM", "H");
		
		return
		Arrays.stream(roman.split(""))
				.mapToInt(MAP::get).sum();
	}

	public static void main(String[] args) {
		String roman = "MMMCMXCIX";
		
		System.out.println(convert1(roman));
		System.out.println(convert2(roman));
		
		String[] romans = new String[] {"DXC", "LVII", "III", "CLXIV"};
		int[] values = Arrays.stream(romans).mapToInt(RomanToInteger::convert2).toArray();
		System.out.println(Arrays.toString(values));
		
		String re = "^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$";
		Pattern pattern = Pattern.compile(re);
		
		romans = new String[] {"XCD", "LVII", "IIII", "CLXIV"};
		Arrays.stream(romans)
				.filter(s -> pattern.matcher(s).matches())
				.mapToInt(RomanToInteger::convert1)
				.forEach(System.out::println);
		
	}

}
