package day010;

public class Prog010 {

	public static void main(String[] args) {
		String s = "";
		
		System.out.println(s.isBlank());
		System.out.println(s.isEmpty());
		
		s = "\n";
		
		System.out.println(s.isBlank());
		System.out.println(s.isEmpty());
		
		System.out.println(s.length());
		
		System.out.println("\u0C06".length());
	}

}
