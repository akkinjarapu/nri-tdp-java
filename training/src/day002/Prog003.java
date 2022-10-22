package day002;

public class Prog003 {
	/* Properties, Attributes */
	int a = 10; // instance var
	static int b = 20; // class var

	public static void main(String[] args) {
		Prog003 prg1 = new Prog003();
		System.out.printf("%d %d\n", prg1.a, prg1.b);
		
		Prog003 prg2 = new Prog003();
		System.out.printf("%d %d\n", prg2.a, prg2.b);
		
		prg1.a = 100;
		prg1.b = 200;
		
		System.out.printf("%d %d\n", prg1.a, prg1.b);
		System.out.printf("%d %d\n", prg2.a, prg2.b);
	}

}
