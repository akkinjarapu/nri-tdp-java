package day035;

public class ThreadsDemo07 {

	public static void main(String[] args) throws InterruptedException {
		Thread th1 = new Thread(new Thread04(101, 199));
		Thread th2 = new Thread(new Thread04(201, 299));
		th1.start();
		th2.start();
		th1.join();
		th2.join();
		System.out.println("Main closed");
	}

}
