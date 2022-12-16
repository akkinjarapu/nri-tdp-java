package practice;

import java.util.LinkedHashMap;
import java.util.stream.IntStream;

public class IntegrToRoman {
	private static final String[] THOUSANDS = { "", "M", "MM", "MMM" };
	private static final String[] HUNDREDS = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
	private static final String[] TENS = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
	private static final String[] DIGITS = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };

	private static final LinkedHashMap<Integer, String> MAP = new LinkedHashMap<>(13, 1);

	static {
		MAP.put(1000, "M");
		MAP.put(900, "CM");
		MAP.put(500, "D");
		MAP.put(400, "CD");
		MAP.put(100, "C");
		MAP.put(90, "XC");
		MAP.put(50, "L");
		MAP.put(40, "XL");
		MAP.put(10, "X");
		MAP.put(9, "IX");
		MAP.put(5, "V");
		MAP.put(4, "IV");
		MAP.put(1, "I");
	}

	// time efficient, but not space efficient
	private static String convert1(int num) {
		StringBuilder sb = new StringBuilder();

		sb.append(THOUSANDS[num / 1000]);

		num %= 1000;
		sb.append(HUNDREDS[num / 100]);

		num %= 100;
		sb.append(TENS[num / 10]);

		sb.append(DIGITS[num % 10]);

		return sb.toString();
	}

	// Space efficient, but not time efficient
	private static String convert2(int num) {
		StringBuilder sb = new StringBuilder();

		for (Integer denomination : MAP.keySet()) {
			if (num >= denomination) {
				int frequency = num / denomination;
				sb.append(MAP.get(denomination).repeat(frequency));
				num %= denomination;
			}
		}

		return sb.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(convert1(3999));
		System.out.println(convert2(3999));

		IntStream.of(3999, 590, 99, 9, 8, 4, 3)
					.mapToObj(IntegrToRoman::convert1)
					.forEach(System.out::println);

		IntStream.of(3999, 590, 99, 9, 8, 4, 3)
					.mapToObj(IntegrToRoman::convert2)
					.forEach(System.out::println);
	}

}
