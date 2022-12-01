package day028;

public class StreamDemo08 {

	public static void main(String[] args) {
		/* Return a string of all traders’ names sorted alphabetically. */
		String result = Dataset.TRANSACTIONS
				.stream()
//				.map(Transaction::getTrader)
//				.map(Trader::getName)
				.map(t -> t.getTrader().getName())
				.distinct()
				.sorted()
				.reduce("", (s1, s2) -> s1 + s2);
		
		System.out.println(result);
	}

}
