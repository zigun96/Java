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
		System.out.println("�۸۸�!!");
	}
}
public class AnimalExample {
	public static void main(String[] args) {
		ProgramInfo.print("super �ǽ�", "�����", 2.0);
		Dog dog1 = new Dog();
		dog1.printMessage();
	}
}
