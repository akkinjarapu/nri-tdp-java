package day035;

public class ThreadsDemo13 {

	public static void main(String[] args) {
		Thread producer = new Producer2();
		Thread consumer = new Thread(new Consumer2());
		
		producer.start();
		consumer.start();
		
		System.out.println(ProducerConsumer.getQuantity());
	}

}
