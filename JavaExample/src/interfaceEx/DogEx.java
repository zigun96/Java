package interfaceEx;

interface Pet {
	void makeSound();
}

class Dog implements Pet {
	public void makeSound() {
		System.out.println("�۸۸�!");
	}
}

public class DogEx {
	public static void main(String[] args) {
		Pet p = new Dog();
		p.makeSound();
	}
}
