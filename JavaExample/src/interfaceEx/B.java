package interfaceEx;

interface A {
	default void abc() {
		System.out.println("A �������̽��� abc()");
	}
}

public class B implements A {
	public void abc() {
		// �������̽��� �޼��带 �θ� �� '�������̽���.super.�޼���();'
		A.super.abc();
		System.out.println("B Ŭ������ abc()");
	}
	// public Ŭ������ ���� �޼ҵ� main()
	public static void main(String[] args) {
		B b = new B();
		b.abc();
	}
}
