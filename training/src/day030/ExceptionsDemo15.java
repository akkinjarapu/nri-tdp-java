package day030;

public class ExceptionsDemo15 {

	public static void main(String[] args) {
		try {
			level1(10, 3);
			System.out.println("=================");
			level1(10, 0);
			System.out.println("=================");
			level1(10, 5);
		} catch (ArithmeticException e) {
			System.out.println("Handled in main method");
		}
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
		catch(NullPointerException e ) {
			System.out.println("Handled in level1 method");
		}
//		catch(Exception e ) {
//			System.out.println("Generalized CATCH HANDLER");
//			e.printStackTrace();
//		}
	}

}
