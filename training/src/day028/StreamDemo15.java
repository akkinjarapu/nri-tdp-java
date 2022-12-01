package day028;

import static java.util.Comparator.comparing;

public class StreamDemo15 {

	public static void main(String[] args) {
		/* What’s the highest value of all the transactions? */
		int max = Dataset.TRANSACTIONS
				.stream()
				.max(comparing(Transaction::getValue))
				.get()
				.getValue();
		
		System.out.println(max);
	}

}
