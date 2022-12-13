package day035;

public class Thread02 implements Runnable {

	@Override
	public void run() {
		
		for (int i = 201; i <= 299; i++) {
			System.out.print(i + " ");
		}
		
	}

}
