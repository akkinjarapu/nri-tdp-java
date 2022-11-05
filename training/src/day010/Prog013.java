package day010;

public class Prog013 {

	public static void main(String[] args) {
		String s = "Amaravathi";
		
		System.out.println(s);
		System.err.println(s);
		
		System.out.println(s.substring(5));    // suffix
		System.out.println(s.substring(0, 5)); // prefix
		System.out.println(s.substring(3, 8)); // sub sequence
		
		System.out.println(s.toCharArray());
		
		for(char ch : s.toCharArray())
			System.out.println(ch);
	}

}
