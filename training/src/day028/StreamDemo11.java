package day028;

public class StreamDemo11 {

	public static void main(String[] args) {
		/* Are any traders based in Milan? */
		boolean result = Dataset.TRANSACTIONS
				.stream()
//				.map(Transaction::getTrader)
				.anyMatch(t -> "Milan".equalsIgnoreCase(t.getTrader().getCity()));
		
		System.out.println(result);
	}

}
