package classExample;

class Name {
	String name = "ȫ�浿";
	void namePrint() {
		System.out.println("���α׷� ������ ����: " + name);
	}
}

public class ClassEx01 {
	public static void main(String[] args) {
		Name n = new Name();
		
//		n.name = "�����";
		System.out.println(n.name);
		n.name = "�����";
		n.namePrint();
	}
}
