package classExample;

class DefaultA {
	int m;
	void work() {
		System.out.println(m);
	}
	// �⺻ ������ �ڵ� �߰�(A){}
}

class DefaultB {
	int m;
	void work() {
		System.out.println(m);
	}
	DefaultB() { // �⺻ ������
	}
}

class DefaultC {
	int m;
	void work() {
		System.out.println(m);
	}
	DefaultC(){} // �⺻ ������
	DefaultC(int a) { // ������ �����ε� 
		m = a;
	}
}

public class DefaultConstructor {
	public static void main(String[] args) {
		// #1. �⺻ �����ڸ� �̿��� ��ü ����
		DefaultA a = new DefaultA();
		DefaultB b = new DefaultB();
		DefaultC c = new DefaultC(3);
		DefaultC d = new DefaultC(); // ���� (�⺻ ������ ����)
		
		// #2. �޼��� ȣ��
		a.work(); // 0
		b.work(); // 0
		c.work(); // 3
		d.work(); // 0
	}
}
