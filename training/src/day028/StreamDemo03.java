package day028;

import static java.util.Comparator.comparing;

import java.util.Comparator;
import java.util.List;

public class StreamDemo03 {

	public static void main(String[] args) {
		/* Find all transactions in the year 2011 
		 * and sort them by value (small to high).  */
		List<Transaction> list = ordered(false);
		
		list.forEach(System.out::println);
	}

	private static List<Transaction> ordered(boolean ascending) {
		Comparator<Transaction> comparer = comparing(Transaction::getValue);
		List<Transaction> list = Dataset.TRANSACTIONS
			.stream()
			.filter(t -> t.getYear() == 2011)
			.sorted(ascending ? comparer : comparer.reversed())
			.toList();
		return list;
	}

}
