package GenericEx;

// �Լ��� �������̽�
interface A {
	abstract void abc();
}

class B implements A {
	@Override
	public void abc() {
		System.out.println("�޼ҵ� ���� 1");
	}
}

public class OOPvsLabmda {
	public static void main (String[] args) {
		// 1. �Ϲ����� �޼ҵ� ����
		A a1 = new B();
		a1.abc();
		
		// 2. �͸��� �̳�Ŭ���� ����, Ŭ���� B�� �ʿ� ������
		A a2 = new A() {
			public void abc() {
				System.out.println("�޼��� ���� 2");
			}
		};
		a2.abc();
		
		// 3. ���ٽ� Ȱ���, ��ü ���� �� �޼ҵ� ����
		A a3 = () -> System.out.println("�޼��� ���� 3");
		a3.abc();
	}
}
