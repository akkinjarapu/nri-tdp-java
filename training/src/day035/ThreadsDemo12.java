package day035;

public class ThreadsDemo12 {

	public static void main(String[] args) {
		Thread producer = new Producer();
		Thread consumer = new Thread(new Consumer());
		
		producer.start();
		consumer.start();
		
		System.out.println(Cakes.quantity);
	}

}
