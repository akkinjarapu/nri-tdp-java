package day009;

public class Prog007 {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
//			System.out.println("ALWAYS");
			
			if((i & 1) == 0)
				continue;
			
			if(i == 7)
				break;
			
			System.out.printf("%-3d X %3d = %3d\n", 5, i, 5 * i);
		}
	}
}
