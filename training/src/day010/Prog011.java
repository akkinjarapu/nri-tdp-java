package day010;

public class Prog011 {

	public static void main(String[] args) {
		String s = "anand";
		
		System.out.println((s+" ").repeat(3));
		System.out.println(s.repeat(0));
//		System.out.println(s.repeat(-3)); // illegal input
		
		System.out.println(s.replace('a', 'd'));
		System.out.println();
		
		System.out.println(s.length());
		System.out.println(s);
		System.out.println(s.replace("a", ""));
		System.out.println(s.replace("a", "").length());
		System.out.println(s.length() - s.replace("a", "").length());
//		System.out.println(s.replace("a", ""));
		
	}

}
