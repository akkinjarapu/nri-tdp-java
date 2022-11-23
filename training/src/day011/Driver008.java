package day011;

public class Driver008 { 

	public static void main(String[] args) {
		Prog008 obj = new Prog008();
		System.out.println(obj.hashCode());

		Prog008 obj1 = new Prog008();
		System.out.println(obj1.hashCode());
		
		System.out.println(obj1 == obj);
		
		Prog008 obj2 = new Prog008(100);
		System.out.println(obj2.hashCode());
		
		Prog008 obj3 = new Prog008('A');
		System.out.println(obj3.hashCode());
		
		Prog008 obj4 = new Prog008(10.5678);
		System.out.println(obj4.hashCode());
	}

}
