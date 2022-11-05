package day010;

public class Prog012 {
	
	public static void main(String[] args) {
		String s = "     \nnri tdp training          ";
		
		System.out.println(s.length());
		System.out.println(s.strip().length());
		
		System.out.println(s);
		System.out.println(s.strip());
		
		System.out.println(s.stripLeading().length());
		System.out.println(s.stripTrailing().length());
	}
	
}
