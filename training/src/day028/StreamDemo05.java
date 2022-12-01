package day028;

import static java.util.stream.Collectors.toSet;

import java.util.Set;

public class StreamDemo05 {

	public static void main(String[] args) {
		/* What are all the unique cities where the traders work? */
		Set<String> list = Dataset.TRANSACTIONS
				.stream()
//				.map(Transaction::getTrader)
//				.map(Trader::getCity)
				.map(t -> t.getTrader().getCity())
//				.distinct()
//				.toList();
				.collect(toSet());
			
			list.forEach(System.out::println);
	}

}
