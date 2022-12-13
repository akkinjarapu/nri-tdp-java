package day035;

public class ProducerConsumer {
	private static int quantity;

	public synchronized static int getQuantity() {
		return quantity;
	}
	
	public synchronized static void increment( ) {
		quantity++;
	}
	
	public synchronized static void decrement( ) {
		quantity--;
	}
}
