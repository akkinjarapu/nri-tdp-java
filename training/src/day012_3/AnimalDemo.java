package day012_3;

public class AnimalDemo {

	public static void main(String[] args) {
		Animal animal;
		
		animal = new Dog();
		animal.bark();
		
		animal = new Cat();
		animal.bark();
	}
}

class Animal {
	public void bark() {
		System.out.println("SOUND");
	}
	
	@Override
	public String toString() {
		return "Animal";
	}
}

class Dog extends Animal {

	@Override
	public void bark() {
		System.out.println("Bhow Bhow");
	}

	@Override
	public String toString() {
		return "Dog";
	}
	
}

class Cat extends Animal {

	@Override
	public void bark() {
		System.out.println("Meow Meow");
	}

	@Override
	public String toString() {
		return "Cat";
	}
	
}