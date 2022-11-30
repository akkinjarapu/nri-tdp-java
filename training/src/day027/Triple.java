package day027;

public class Triple extends Point {
	private double z;
	
	public Triple(int x, int y, double z) {
		super(x, y);
		this.z = z;
	}

	public double getZ() {
		return z;
	}

	@Override
	public String toString() {
		return "(" + getX() + ", " + getY() + ", " + (int) z + ")";
	}

	
}
