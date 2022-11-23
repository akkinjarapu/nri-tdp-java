package day011;

public class Driver011 {
	
	public static void main(String[] args) {
		Prog011 obj = new Prog011();
		System.out.println(obj);
		
		Prog011 cObj = new Prog011(obj);
		System.out.println(cObj);
		
		System.out.println(obj == cObj);
	}
	
}
