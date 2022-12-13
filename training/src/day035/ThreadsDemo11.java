package day035;

public class ThreadsDemo11 {

	public static void main(String[] args) {
		Thread th1 = new Thread(() -> {
			for(int i = 1; i <= 5; i++) {
				System.out.println(i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		Thread th2 = new Thread(() -> {
			for(int i = 10; i <= 15; i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		th1.setPriority(10);
		th1.start();
		th2.start();
	}

}
