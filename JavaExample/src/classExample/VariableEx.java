package classExample;

public class VariableEx {
	static int sval = 100; // Ŭ�������� = ����ƽ����
	int ival = 200; // �ʵ� = �ν��Ͻ����� = ��ü������ = �ɹ�����
	public static void main(String[] args) {
		// ���� ��� Ŭ���� ������ ������ �ھƳ��� ������ ȣ���� �� ����
		System.out.println("sval: " + sval);
		// ���赵�� ��ü�� ����� ���̶� ������ ���� �޸𸮿� �Ҵ���� ���� 
//		System.out.println("ival: " + ival);
		
		VariableEx ex1 = new VariableEx();
		VariableEx ex2 = new VariableEx();
		System.out.println("ex1 ival: " + ex1.ival);
		System.out.println("ex2 ival: " + ex2.ival);
		
		
		ex1.ival = 300;
		System.out.println("ex1 ival: " + ex1.ival);
		System.out.println("ex2 ival: " + ex2.ival);
		
		int ival = 400; // �������� = ���ú���
		System.out.println("ival: "+ ival);
	}
}
