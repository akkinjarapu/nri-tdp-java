package day005;

public class Prog003 {

	public static void main(String[] args) {
		
		char ch = '\u00A1'; // u000A not accepted
		System.out.println(ch);
		
		ch = 'ఓ';
		System.out.println(ch);
		
		ch = '\u0C06';
		System.out.println(ch);
		
		ch = 3078;
		System.out.println(ch);
		
		ch = 0X0C06;
		System.out.println(ch);

	}

}
