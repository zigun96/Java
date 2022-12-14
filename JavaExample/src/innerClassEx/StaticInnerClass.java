package innerClassEx;

class OuterA1 {
	static int a = 3;
	static int b = 4;
	static void method1() {
		System.out.println("Instance method");
	}
	static void method2() {
		System.out.println("static method");
	}
	// ���� �̳� Ŭ����
	static class InnerB1 {
		int a = 99;
		void bcd() {
			// �ʵ� ���
			System.out.println(a);
			System.out.println(b);
			// �޼��� ȣ��
			method1();
			method2();
		}
	}
}

public class StaticInnerClass {
	public static void main(String[] args) {
		// ���� �̳� Ŭ������ ��ü ����
		OuterA1.InnerB1 b = new OuterA1.InnerB1();
		// �޼��� ȣ��
		b.bcd();
	}
}
