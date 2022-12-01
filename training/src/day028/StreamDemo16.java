package day028;

import java.util.Comparator;

public class StreamDemo16 {

	public static void main(String[] args) {
		/* Find the transaction with the smallest value */
		Transaction min = Dataset.TRANSACTIONS
				.stream()
				.min(Comparator.comparing(Transaction::getValue))
				.get();
		
		System.out.println(min);
	}

}
