package day030;

public class ExceptionsDemo14 {

	public static void main(String[] args) {
		level1(10, 3);
		System.out.println("=================");
		level1(10, 0);
		System.out.println("=================");
		level1(10, 5);
	}
	
	@SuppressWarnings("null")
	public static void level1(int num, int div) {
		try {
			if(div > 3) {
				Integer k = null;
				k += 10;
			}
			System.out.println(num/div);
		}
		catch(ArithmeticException | NullPointerException e ) {
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
