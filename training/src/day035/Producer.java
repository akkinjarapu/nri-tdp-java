package day035;

public class Producer extends Thread {

	@Override
	public void run() {
		Cakes.quantity++;
		System.out.println("P -> " + Cakes.quantity);
	}

}
