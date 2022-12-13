package day035;

public class ThreadsDemo02 {

	public static void main(String[] args) {

		Thread01 thread01 = new Thread01();
		thread01.start();

		System.out.println();

		for (int i = 201; i <= 299; i++) {
			System.out.print(i + " ");
		}

		System.out.println();

		for (int i = 301; i <= 399; i++) {
			System.out.print(i + " ");
		}
	}

}
