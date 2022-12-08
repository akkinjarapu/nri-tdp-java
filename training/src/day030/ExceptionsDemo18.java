package day030;

public class ExceptionsDemo18 {

	public static void main(String[] args) throws Exception {
		try {
			level1(10, 3);
			System.out.println("=================");
			level1(10, 0);
			
		} catch (Exception e) {
			System.out.println("Handled in main method");
		}
		
		System.out.println("=================");
		level1(10, 5);
		System.out.println("NORMAL");
	}
	
	@SuppressWarnings("null")
	public static void level1(int num, int div) throws Exception {
			if(div > 3) {
				Integer k = null;
				k += 10;
			}
			
			System.out.println(num/div);
	}

}
