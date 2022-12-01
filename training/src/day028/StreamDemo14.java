package day028;

public class StreamDemo14 {

	public static void main(String[] args) {
		/* What’s the highest value of all the transactions? */
		int max = Dataset.TRANSACTIONS
				.stream()
				.mapToInt(Transaction::getValue)
				.reduce(Math::max)
				.getAsInt();
		
		System.out.println(max);
	}

}
