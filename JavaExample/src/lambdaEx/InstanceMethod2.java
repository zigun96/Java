package lambdaEx;

interface C {
	int abc (String str);
}

public class InstanceMethod2 {
	public static void main(String[] args) {
		// 1.�͸��� �̳�Ŭ����
		C a1 = new C() {
			@Override
			public int abc(String str) {
				return str.length();
			}
		};
		
		// 2.���ٽ�
		C a2 = (String str) -> str.length();
		
		// 3.�ڹ����� �ν��Ͻ��޼��� ����
		C a3 = a1::abc;
		
		// ���
		System.out.println(a1.abc("�ȳ��ϼ���!"));
		System.out.println(a2.abc("�ȳ��ϼ���!"));
		System.out.println(a3.abc("�ȳ��ϼ���!"));
	}
}
