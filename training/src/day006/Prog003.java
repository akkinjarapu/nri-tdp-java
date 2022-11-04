package day006;

public class Prog003 {

	public static void main(String[] args) {
		System.out.println(Integer.parseInt("a", 16));
		System.out.println(Integer.parseInt("0a", 16));
		
		System.out.println(Integer.decode("-#a"));
		System.out.println(Integer.decode("0xa"));
		System.out.println(Integer.decode("+012"));
		
		System.out.println(Integer.reverse(-1));
	}

}
