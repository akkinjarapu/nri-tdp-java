package day002;

public class Prog002 {
	static int b;
	int c;
	
	void disp() {
		System.out.println(b);
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		/* local variable, should be initialized */
		int a = 10;
		
		System.out.println(a);
		
		System.out.println(b);
		
		Prog002 prg = new Prog002();
		prg.disp();
		System.out.println(prg.c);
	}
}
