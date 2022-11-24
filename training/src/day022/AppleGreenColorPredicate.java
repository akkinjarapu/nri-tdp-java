package day022;

public class AppleGreenColorPredicate implements ApplePredicate {

	@Override
	public boolean test(Apple apple) {
		return apple.getColor().equals("Green");
	}

}
