package day012_1;

public class AnimalDemo {

	public static void main(String[] args) {
		Animal animal = new Animal();
		System.out.println(animal);
		animal.bark();
		
		Dog dog = new Dog();
		System.out.println(dog);
		dog.bark();
		
		Animal dog1 = new Dog();
		System.out.println(dog1);
		dog1.bark();
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