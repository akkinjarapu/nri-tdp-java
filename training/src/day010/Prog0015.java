package day010;

public class Prog0015 {
	
	public static void main(String[] args) {
		String s = "%d %f %s";
		
		System.out.println(String.format(s, 10, 20.86, "string"));
		
		String[] fruits = {"APPLE","MANGO"};
		System.out.println(String.join(" $ ", fruits));
		
		String valueOf = String.valueOf(100);
		System.out.println(valueOf);
		
		int val = Integer.parseInt(valueOf);
		System.out.println(val);
	}
	
}
