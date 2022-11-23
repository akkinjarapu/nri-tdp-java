package day012;

public interface Shape {
	public double area();
	public default void disp() {
		System.out.println("DEFAULT");
	}
}

class Rectangle implements Shape {
	int height;
	int width;
	
	public Rectangle() {
		height = 10;
		width = 20;
	}
	
	public Rectangle(int side) {
		height = width = side;
	}

	@Override
	public double area() {
		return height * width;	
	}
	
}

class Circle implements Shape {
	int radius = 10;

	@Override
	public double area() {
		return Math.PI * radius * radius;	
	}
	
}

class Square extends Rectangle {
	public Square(int side) {
		super(side);
	}

	@Override
	public void disp() {
		System.out.println("Square DISP");
	}
}
