package day015;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		Random random = new Random();
		
		System.out.println(random.nextInt());
		
		for (int i = 1; i <= 10; i++)
			System.out.println(random.nextInt(5));
		
		System.out.println(random.nextDouble());
		
	}

}
