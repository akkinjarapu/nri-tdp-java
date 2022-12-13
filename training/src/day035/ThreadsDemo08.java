package day035;

public class ThreadsDemo08 {

	public static void main(String[] args) {
		Thread th = new Thread(() -> {
			for(int i = 1; i < 100; i++)
				System.out.println(i);
		});
		th.start();
	}

}
