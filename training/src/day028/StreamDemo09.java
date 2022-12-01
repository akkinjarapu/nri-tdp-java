package day028;

import static java.util.stream.Collectors.joining;

public class StreamDemo09 {

	public static void main(String[] args) {
		/* Return a string of all traders’ names sorted alphabetically. */
		String result = Dataset.TRANSACTIONS
				.stream()
				.map(t -> t.getTrader().getName())
				.distinct()
				.sorted()
//				.reduce("", (s1, s2) -> s1 + s2);
				.collect(joining());
		
		System.out.println(result);
	}

}
