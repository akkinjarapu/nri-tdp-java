package day010;

public class Prog002 {
	
	public static void main(String[] args) {
		String s1 = "ABC";
		String s2 = "ABC";
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		String s3 = new String("ABC");
		
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
	}
	
}
