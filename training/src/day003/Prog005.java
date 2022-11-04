package day003;

import java.math.BigInteger;

public class Prog005 {
	
	public static void main(String[] args) {
		long li = 987654321987654321L;
		
		System.out.println(li);
		
//		long l = 9876543219876543219L;
		
		BigInteger bi = new BigInteger("9876543219876543219");
		bi = bi.add(BigInteger.valueOf(50));
		System.out.println(bi);
	}

}
