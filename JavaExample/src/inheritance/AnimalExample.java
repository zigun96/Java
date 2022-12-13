package inheritance;

import externalExample.ProgramInfo;

abstract class Animal {
	public void display() {
		System.out.println("I am an animal");
	}
	abstract void makeSound();
}
class Dog extends Animal {
	@Override
	public void display() {
		System.out.println("I am a dog");
	}
	public void printMessage() {
		display();
		super.display();
	}
	@Override
	void makeSound() {
		System.out.println("¸Û¸Û¸Û!!");
	}
}
public class AnimalExample {
	public static void main(String[] args) {
		ProgramInfo.print("super ½Ç½À", "Â÷Àç°Ç", 2.0);
		Dog dog1 = new Dog();
		dog1.printMessage();
	}
}
