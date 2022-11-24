package day022;

public class Apple {
	private String color;
	private int weight;

	public Apple(String color, int weight) {
		super();
		this.color = color;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return color + "=" + weight;
	}

	public String getColor() {
		return color;
	}

	public int getWeight() {
		return weight;
	}
	
	public boolean isColor(String color) {
		return this.color.equals(color);
	}
	
	public boolean isWeightInRange(int min, int max) {
		return weight >= min && weight < max;
	}
}
