package day031;

public class Pair {
	private int first;
	private int second;
	private double weight;
	
	public Pair(int qty) {
		super();
		this.first = qty;
		this.second = qty;
		this.weight = 0;
	}
	
	public Pair(int first, int second) {
		super();
		this.first = first;
		this.second = second;
		this.weight = 0;
	}

	public int getFirst() {
		return first;
	}

	public int getSecond() {
		return second;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "(" + first + ", " + second + ")";
	}
	
	public Pair serveBy (Pair other) {
		int first = Math.max(0, this.first - other.getFirst());
		int second = Math.max(0, this.second - other.second);
		return new Pair(first, second);
	}
	
}
