package day012_2;

public class AnimalDemo {

	public static void main(String[] args) {
		Animal animal;
		
		animal = new Animal();
		animal.bark();
		
		animal = new Dog();
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