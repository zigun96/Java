package inheritance;
class OneDown {
	void m1() {
		System.out.println("Ŭ������ OneDown�� �ִ� �޼ҵ� m1");
	}
}
class TwoDown extends OneDown {
	void m2() {
		System.out.println("Ŭ������ TwoDown�� �ִ� �޼ҵ� m2");
	}
}
public class ClassCastingEx1 {
	public static void main(String[] args) {
		TwoDown t = (TwoDown) new TwoDown(); // �ٿ�ĳ����
		t.m1();
		t.m2();
	}
}
