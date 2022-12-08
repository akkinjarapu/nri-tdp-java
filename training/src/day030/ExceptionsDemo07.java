package day030;

public class ExceptionsDemo07 {

	public static void main(String[] args) {
		level1(10, 3);
		level1(10, 0);
		level1(10, 5);
	}
	
	public static void level1(int num, int div) {
		try {
			System.out.println(num/div);
		}
		catch(Exception e ) {
			e.printStackTrace();
		}
		System.out.println("NO EXCEPTION OCCURED");
	}

}
