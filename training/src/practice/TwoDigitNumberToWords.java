package practice;

public class TwoDigitNumberToWords {
	private static String[] ONES = {"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE",
			"SIX", "SEVEN", "EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN", 
			"FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINTEEN"};
	private static String[] TENS = {"", "", "TWENTY", "THIRTY", "FORTY", "FIFTY", 
			"SIXTY", "SEVENTY", "EIGHTY", "NINTY"};
	
	private String convert(int num) {
		StringBuilder sb = new StringBuilder();
		
		int opd = num < 20 ? num : num % 10;
		int tpd = num < 20 ? 0 : num / 10;
		
		sb.append(TENS[tpd]);
		if(!sb.isEmpty())
			sb.append(' ');
		sb.append(ONES[opd]);
		
		return sb.toString();
	}

	public static void main(String[] args) {
		int num = (int) (Math.random() * 100);
		System.out.println(num);
		
		System.out.println(new TwoDigitNumberToWords().convert(num));
	}

}
