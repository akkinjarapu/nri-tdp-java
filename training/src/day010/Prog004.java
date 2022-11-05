package day010;

public class Prog004 {

	public static void main(String[] args) {
		String s = "ABఆD";
		
		System.out.println(s.charAt(3));
		
		System.out.println(s.codePointAt(3));
		
		System.out.println(s.codePointAt(2));
		
		System.out.println(s.codePointCount(0, s.length()));
	}

}
