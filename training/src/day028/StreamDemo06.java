package day028;

import static java.util.Comparator.comparing;

import java.util.List;

public class StreamDemo06 {

	public static void main(String[] args) {
		/* Find all traders from Cambridge and sort them by name */
		List<Trader> list = Dataset.TRANSACTIONS
				.stream()
				.map(Transaction::getTrader)
				.filter(t -> "Cambridge".equalsIgnoreCase(t.getCity()))
				.distinct()
				.sorted(comparing(Trader::getName))
				.toList();
		
		list.forEach(System.out::println);
	}

}
