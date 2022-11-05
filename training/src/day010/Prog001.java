package day010;

public class Prog001 {

	public static void main(String[] args) {
		String s = "ABC";
		System.out.println(s.hashCode());
		
		s += "D";
		System.out.println(s.hashCode());
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.hashCode());
		
		sb.append("ABC");
		System.out.println(sb.hashCode());
	}

}
