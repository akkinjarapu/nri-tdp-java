package day010;

public class Prog005 {

	public static void main(String[] args) {
		String s = "ABCD";
		
		System.out.println(s.compareTo("ABCD"));
		
		System.out.println(s.compareTo("CDEF"));
		
		System.out.println(s.compareTo("cDEF"));
		
		System.out.println(s.compareTo("ABDEF"));
		
		System.out.println("CDEF".compareTo("ABCD"));
	}

}
