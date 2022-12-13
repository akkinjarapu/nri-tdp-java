package day035;

public class Consumer implements Runnable {

	@Override
	public void run() {
		Cakes.quantity--;
		System.out.println("C -> " +Cakes.quantity);
	}

}
