package day028;

public class StreamDemo07 {

	public static void main(String[] args) {
		/* Return a string of all traders’ names sorted alphabetically. */
		String result = Dataset.TRANSACTIONS
				.stream()
				.map(Transaction::getTrader)
				.map(Trader::getName)
				.distinct()
				.sorted()
				.reduce("", (s1, s2) -> s1 + s2);
		
		System.out.println(result);
	}

}
