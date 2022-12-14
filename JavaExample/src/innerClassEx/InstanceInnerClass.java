package innerClassEx;

class OuterA {
	int a = 3;
	int b = 4;
	void abc() {
		System.out.println("A Ŭ���� �޼���");
	}
	// �ν��Ͻ� �̳� Ŭ���� ����
	class InnerB {
		int a = 5;
		int b = 6;
		void abc() {
			System.out.println("B Ŭ���� �޼���");
		}
		void bcd() {
			// �̳� Ŭ������ �ɹ� ȣ�� �Ǵ� ���
			System.out.println(a);
			System.out.println(b);
			abc();
			
			// �ƿ��� Ŭ������ �ɹ� ȣ�� �Ǵ� ���
			System.out.println(OuterA.this.a);
			System.out.println(OuterA.this.b);
			OuterA.this.abc();
		}
	}
}

public class InstanceInnerClass {
	public static void main(String[] args) {
		// �ƿ��� Ŭ���� ��ü ����
		OuterA a = new OuterA();
		
		// �̳� Ŭ���� ��ü ����
		OuterA.InnerB b = a.new InnerB();
		b.bcd();
	}
}
