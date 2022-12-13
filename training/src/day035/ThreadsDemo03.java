package day035;

public class ThreadsDemo03 {

	public static void main(String[] args) {

		Thread01 thread01 = new Thread01();
		thread01.start();

		System.out.println();

		Runnable runnable = new Thread02();
		Thread thread02 = new Thread(runnable);
		thread02.start();

		System.out.println();

		for (int i = 301; i <= 399; i++) {
			System.out.print(i + " ");
		}
	}

}
