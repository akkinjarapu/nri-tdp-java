package day035;

public class Thread01 extends Thread {

	@Override
	public void run() {
		for (int i = 101; i <= 199; i++) {
			System.out.print(i + " ");
		}
	}
}
