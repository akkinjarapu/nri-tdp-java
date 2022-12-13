package day035;

public class ThreadsDemo04 {

	public static void main(String[] args) {
		Thread th = new Thread03();
		
		Thread th1 = new Thread(new Thread03());
		
		th.start();
		th1.start();
	}

}
