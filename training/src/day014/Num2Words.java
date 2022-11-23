package day014;

public class Num2Words {
	
	public static void main(String[] args) {
		String[] ones = { "", "ONE", "TWO", "THREE", "FOUR", 
				"FIVE", "SIX", "SEVEN", "EIGHT", "NINE",
				"TEN", "ELEVEN", "TWELVE", "THIRTEEN", "FOURTEEN",
				"FIFTEEN", "SIXTEEN", "SEVENTEEN", "EIGHTEEN", "NINTEEN"};
		
		String[] tens = {"", "", "TWENTY", "THIRTY", "FORTY", "FIFTY", "SIXTY", "SEVENTY", "EIGHTY", "NINTY"};

		for(int a = 100; a < 150; a++) {
			int d3 = a/100;
			if(d3 > 0)
				System.out.print(ones[d3] + " Hundred");
			
			int d = a % 100;
			
			if(d3 > 0 && d > 0)
				System.out.print(" and ");
			
			if (d3 == 0 && d == 0)
				System.out.println("ZERO");
			else if (d < 20)
				System.out.println(ones[d]);
			else {
				int d1 = d % 10, d2 = d / 10;
				
				if(d1 == 0)
					System.out.println(tens[d2]);
				else 
					System.out.printf("%s %s", tens[d2], ones[d1]).println();;
			}
		}
		
	}

}
