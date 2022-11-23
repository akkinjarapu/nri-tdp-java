package pack2;

import pack1.A;

public class E extends A {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.d);
		
		E e = new E();
		System.out.println(e.c);
		System.out.println(e.d);
	}

}
