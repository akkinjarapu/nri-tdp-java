package day030;

public class ExceptionsDemo10 {

	public static void main(String[] args) {
		level1(10, 3);
		level1(10, 0);
		level1(10, 5);
	}
	
	public static void level1(int num, int div) {
		try {
			System.out.println(num/div);
			System.out.println("after Exception");
		}
		catch(ArithmeticException e ) {
			System.out.println("Specialized CATCH HANDLER");
			e.printStackTrace();
		}
		catch(Exception e ) {
			System.out.println("Generalized CATCH HANDLER");
			e.printStackTrace();
		}
		System.out.println("NO EXCEPTION OCCURED");
	}

}
