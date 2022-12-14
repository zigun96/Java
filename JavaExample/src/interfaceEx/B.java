package interfaceEx;

interface A {
	default void abc() {
		System.out.println("A 인터페이스의 abc()");
	}
}

public class B implements A {
	public void abc() {
		// 인터페이스의 메서드를 부를 때 '인터페이스명.super.메서드();'
		A.super.abc();
		System.out.println("B 클래스의 abc()");
	}
	// public 클래스의 메인 메소드 main()
	public static void main(String[] args) {
		B b = new B();
		b.abc();
	}
}
