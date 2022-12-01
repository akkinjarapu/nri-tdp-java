package day028;

public class StreamDemo10 {

	public static void main(String[] args) {
		/* Are any traders based in Milan? */
		boolean result = Dataset.TRANSACTIONS
				.stream()
				.map(Transaction::getTrader)
				.anyMatch(t -> "Milan".equalsIgnoreCase(t.getCity()));
		
		System.out.println(result);
	}

}
