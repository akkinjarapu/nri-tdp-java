package day004;

import java.math.BigDecimal;

public class Prog001 {

	public static void main(String[] args) {
		float f = 10.123456789F;
		System.out.println(f);
		
		double d = 10.123456789F;
		System.out.println(d);
		
		BigDecimal bd = new BigDecimal("10.123456789");
		System.out.println(bd);
	}

}
