package innerClassEx;

class OuterA3 {
	InterfaceC1 c = new InterfaceC1() {
		public void bcd() {
			System.out.println("�͸� �̳� Ŭ����");
		}
	};
	void abc() {
		c.bcd();
	}
}

interface InterfaceC1 {
	public abstract void bcd();
}

public class AnonymousClass {
	public static void main(String[] args) {
		// ��ü ���� �� �޼��� ȣ��
		OuterA3 a = new OuterA3();
		a.abc();
	}
}
