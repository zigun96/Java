package inheritance;

class One {
	void m1() {
		System.out.println("Ŭ���� one�� �ִ� m1 �޼ҵ�");
	}
}
class Two extends One {
	void m1() {
		System.out.println("Ŭ���� two�� �ִ� m1 �޼ҵ�");
	}
}
public class ClassCastingEx {
	public static void main(String[] args) {
		One o = (One)new Two(); // ��ĳ����(One)�� �����ص� �ڵ����� ��ĳ����.
		o.m1();
		// o.m2(); // Compile-time error message.
		((Two) o).m1(); // Compile-time error message.

	}

}
