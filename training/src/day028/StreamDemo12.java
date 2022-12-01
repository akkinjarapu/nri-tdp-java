package day028;

public class StreamDemo12 {

	public static void main(String[] args) {
		/* Print all transactions’ values from the traders living in Cambridge */
		Dataset.TRANSACTIONS
				.stream()
				.filter(t -> "Cambridge".equalsIgnoreCase(t.getTrader().getCity()))
				.map(Transaction::getValue)
				.forEach(System.out::println);
	}

}
