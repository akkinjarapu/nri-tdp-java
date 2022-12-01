package day028;

import java.util.Arrays;
import java.util.List;

public class StreamDemo04 {

	public static void main(String[] args) {
		/* What are all the unique cities where the traders work? */
		List<String> list = Arrays.stream(Dataset.TRADERS)
			.map(Trader::getCity)
			.distinct()
			.toList();
		
		list.forEach(System.out::println);
		
		// Preferable as all traders may not be active
		list = Dataset.TRANSACTIONS
			.stream()
			.map(Transaction::getTrader)
			.map(Trader::getCity)
			.distinct()
			.toList();
		
		list.forEach(System.out::println);
	}

}
