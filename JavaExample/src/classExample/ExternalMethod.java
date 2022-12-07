package classExample;

class MethodA{
	// #. ����Ÿ��: void + �Ű�����: ����
	void print() {
		System.out.println("�ȳ�");
	}
	// #. ����Ÿ��: int + �Ű�����: ����
	int data() {
		return 3;
	}
	// #. ����Ÿ��: double + �Ű�����: 2��
	double sum(double a, int b) {
		return a + b;
	}
	// #. ����Ÿ��: void + �Ű�����: 1�� + ���� �Լ����� (return ����)
	void printMonth(int m) {
		if(m < 0 || m > 12) {
			System.out.println("�߸��� �Է�!");
			// ��ȯ���� ������ return ��ü�� ���� �ִ�.
			return;
		}
		System.out.println(m + "�� �Դϴ�.");
	}
}

public class ExternalMethod {
	public static void main(String[] args) {
		// ��ü ����
		MethodA a = new MethodA();
		
		// ���� �����κ��� �޼��� ȣ��
		a.print(); // "�ȳ�"
		
		int k = a.data();
		a.data();
		System.out.println(k); // 3
		
		double result = a.sum(5.2, 3);
		System.out.println(result); // 8.2
		
		a.printMonth(5); // 5�� �Դϴ�.
		a.printMonth(15); // �߸��� �Է�
	}
}
