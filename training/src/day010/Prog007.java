package day010;

public class Prog007 {

	public static void main(String[] args) {
		String s = "ABCDEFG";
		
		System.out.println(s.endsWith("G"));
		System.out.println(s.endsWith("FG"));
		System.out.println(s.endsWith("DFG"));
		
		System.out.println(s.startsWith("A"));
		System.out.println(s.startsWith("AB"));
		System.out.println(s.startsWith("ABD"));
	}

}
