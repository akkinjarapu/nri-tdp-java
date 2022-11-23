package day012;

public class ShapeDemo {

	public static void main(String[] args) {
		Shape shape;
		
		shape = new Rectangle();
		System.out.println(shape.area());
		shape.disp();
		
		shape = new Circle();
		System.out.println(shape.area());
		
		new Square(10).disp();
	}

}
