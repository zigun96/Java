package classExample;

class A {
	int m;
	void method() {
		System.out.println("A�� �޼���");
	}
}

public class Q2_1 {
	public static void main(String[] args) {
		A a = new A();
		a.m = 5;
		System.out.println(a.m);
		a.method();
	}
}
