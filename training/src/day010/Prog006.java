package day010;

public class Prog006 {

	public static void main(String[] args) {
		String s = "ABCDEFG";
		
		System.out.println(s.concat("HIJ"));
		//s = s.intern(); // no effect
		System.out.println(s);
		
		System.out.println(s.contains("CD"));
		System.out.println(s.contains("CF"));
	}

}
