package classExample;

class Q7_2A {
	// �޼��� print() �����ε�
	// �ñ״�ó(�Ű����� ����, �ڷ���)�� �ٸ��� �����ε��� ���ȴ�.
	void print() {
		System.out.println("�Է°��� �����ϴ�.");
	}
	void print(int a) {
		System.out.printf("���� �Է°� : %d\n",a);
	}
	void print(double a) {
		System.out.printf("�Ǽ� �Է°� : %.1f\n", a);
	}
	void print(String a) {
		System.out.printf("���ڿ� �Է°� : %s\n", a);
	}
}

public class Q7_2 {
	public static void main(String[] args) {
		Q7_2A a = new Q7_2A();
		a.print();
		a.print(3);
		a.print(5.8);
		a.print("�ȳ�");
	}
}
