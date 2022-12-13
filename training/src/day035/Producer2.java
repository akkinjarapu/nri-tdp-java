package day035;

public class Producer2 extends Thread {

	@Override
	public void run() {
		ProducerConsumer.increment();
		System.out.println("P -> " + ProducerConsumer.getQuantity());
	}

}
