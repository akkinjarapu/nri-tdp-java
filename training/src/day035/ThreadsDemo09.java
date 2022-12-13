package day035;

public class ThreadsDemo09 {

	public static void main(String[] args) {
		Thread th = new Thread(() -> {
			for(int i = 1; i < 5; i++) {
				System.out.println("RUNNING");
				System.out.println(i);
				try {
					System.out.println("WAITING");
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("RUNNABLE");
			}
			
			System.out.println("TERMINATED");
		});
		
		System.out.println("NEW");
		
		th.start();
		
		System.out.println("RUNNABLE");
	}

}
