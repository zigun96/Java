package override;

class GrandFather {
	void move() {
		System.out.println("�����̰� �ʿ���!");
	}
}
class Father extends GrandFather {
	void move() {
		System.out.println("������ ���� �� ������! ");
	}
}
public class Child extends Father {
	void move() {
		System.out.println("���ݾ��� ����...");
	}
	
	public static void main(String[] args) {
		GrandFather f1 = new GrandFather();
		Father f2 = new Child();
		f1.move();
		f2.move();
	}
}
