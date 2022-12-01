package day028;

public class StreamDemo13 {

	public static void main(String[] args) {
		/* What’s the highest value of all the transactions? */
		int max = Dataset.TRANSACTIONS
				.stream()
				.mapToInt(Transaction::getValue)
				.max()
				.getAsInt();
		
		System.out.println(max);
	}

}
