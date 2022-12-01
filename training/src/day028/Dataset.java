package day028;

import java.util.List;

public class Dataset {
	public static final Trader[] TRADERS = new Trader[] {
			new Trader("Raoul", "Cambridge"),
			new Trader("Mario","Milan"),
			new Trader("Alan","Cambridge"),
			new Trader("Brian","Cambridge")
	};
	
	public static final List<Transaction> TRANSACTIONS = List.of(
			new Transaction(TRADERS[3], 2011, 300),
			new Transaction(TRADERS[0], 2012, 1000),
			new Transaction(TRADERS[0], 2011, 400),
			new Transaction(TRADERS[1], 2012, 710),
			new Transaction(TRADERS[1], 2012, 700),
			new Transaction(TRADERS[2], 2012, 950)
			);
}
