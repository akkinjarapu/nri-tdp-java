package day010;

public class Prog008 {

	public static void main(String[] args) {
		String s = "ABCDEFG";
		
		System.out.println(s.indexOf('D'));
		System.out.println(s.indexOf(97));
		
		s += "a";
		System.out.println(s.indexOf(97));
		
		System.out.println(s.lastIndexOf('C'));
	}

}
