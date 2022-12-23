package lambdaEx;

interface A2 {
	// B2 type�� �߻�޼���
	B2 abc();
}
interface A3 {
	// B2 type�� �߻�޼���
	B2 abc(int k);
}
interface A4 {
	// B2 type�� �߻�޼���
	B2 abc(String s);
}
class B2 {
	B2() {
		System.out.println("ù ��° ������");
	}
	B2(int k) {
		System.out.println("�� ��° ������");
	}
	B2(String s) {
		System.out.println(s + " �� ��° ������");
	}
}

public class ClassConstructor {
	public static void main(String[] args) {
		// 1.�͸��� �̳�Ŭ����
		A2 a1 = new A2() {
			public B2 abc() {
				// B2() �⺻������ ����
				return new B2();
			}
		};
		
		// 2.���ٽ�, A2�� B2 type �߻�޼��� ���� => B2() �⺻������ ����
		A2 a2 = () -> new B2();
		// Ŭ���� Ÿ�԰� ������ ���� �Ű����� �ڷ�Ÿ���� ������� �Ѵ�.
		// 3.Ŭ���� ������() ���� 
		A2 a3 = B2::new;
		
		// 4.Ŭ���� ������(�Ű�����) ����
		A3 a4 = B2::new;
		
		// 5.Ŭ���� ������(�Ű�����) ����
		A4 a5 = B2::new;
		
		a1.abc();
		a2.abc();
		a3.abc();
		a4.abc(5);
		a5.abc("�ٺ�");
	}
}
