package day012;

public class BoxDemo {

	public static void main(String[] args) {
		Box b = new Box();

		System.out.println(b.getLength());
		System.out.println(b.getBreadth());
		System.out.println(b.getHeight());
		
		System.out.println(b.volume());
		
		b.setHeight(5);
		
		System.out.println(b.volume());
		
		Box b1 = new Box(5);
		System.out.println(b1);
		
		Box b2 = new Box(5, 5, 5);
		System.out.println(b1.equals(b2));
		
		Box b3 = new Box(1, 5, 5);
		System.out.println(b1.equals(b3));
	}

}
