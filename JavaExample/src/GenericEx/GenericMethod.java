package GenericEx;

class GenericMethods {
	public <T> T method1(T t) {
		return t;
	}
	public <T> boolean method2(T t1, T t2) {
		return t1.equals(t2);
	}
	public <T1, T2> void method3(T1 k, T2 v) {
		System.out.println(k + " : " + v);
	}
}

public class GenericMethod {
	public static void main(String[] args) {
		 GenericMethods gm = new GenericMethods();
		 // ��ȯ�� ����
		 String str1 = gm.<String>method1("�ȳ�");
		 // ��ȯ�� ������ => �˾Ƽ� ��������
		 String str2 = gm.method1("�ȳ�");
		 // int num = gm.<Int>method1(100);
		 int num = gm.method1(100);
		 System.out.println(str1 + " : " + num + " : " + str2);
		 
		 boolean boo1 = gm.<Double>method2(25.0, 25.0);
		 boolean boo2 = gm.method2(2, 25);
		 System.out.println(boo1 + " : " + boo2);
		 
		 // ���׸����� ���ǵ� �޼��忡 �μ��� ������ �˾Ƽ� �´� Ÿ���� �������� 
		 gm.<String, Integer>method3("����", 100);
		 gm.method3(100, "����");
	}
}
