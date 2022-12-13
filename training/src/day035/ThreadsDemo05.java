package day035;

public class ThreadsDemo05 {

	public static void main(String[] args) {
		Thread th1 = new Thread(new Thread04(101, 199));
		Thread th2 = new Thread(new Thread04(201, 299));
		th1.start();
		th2.start();
		System.out.println("Main closed");
	}

}
