package day011;

public class Driver012 {

	public static void main(String[] args) {
		Prog012 obj = new Prog012(100);
		
		System.out.println(obj.getA());
		
		obj.setA(200);
		
		System.out.println(obj.getA());
		
		System.err.println(obj.getName());
	}

}
