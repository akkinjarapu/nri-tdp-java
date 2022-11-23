package day013;

public class AbstractDemo {
	public static void main(String[] args) {
//		Test t = new Test1();
	}
}

abstract class Test2 {
	public void disp() {
		System.out.println("Abstract Method");
	}
}

abstract class Test {
	public abstract void disp();
}

class Test1 extends Test {

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}
	
}


