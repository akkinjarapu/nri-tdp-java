package day035;

public class Consumer2 implements Runnable {

	@Override
	public void run() {
		ProducerConsumer.decrement();
		System.out.println("C -> " + ProducerConsumer.getQuantity());
	}

}
