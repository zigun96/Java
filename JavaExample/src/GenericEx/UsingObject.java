package GenericEx;

class Apple {}

class Pencil {}

class Goods3 {
	private Object object = new Object();
	
	public Object getObject() {
		System.out.println(Object.class+" ��ü ����");
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
}

public class UsingObject {
	public static void main(String[] args) {
		Goods3 goods1 = new Goods3();
		// Good3 ��ü�� Apple ��ü ����
		goods1.setObject(new Apple());
		Apple apple = (Apple)goods1.getObject();
		
		Goods3 goods2 = new Goods3();
		// Good3 ��ü�� Pencil ��ü ����
		goods2.setObject(new Pencil());
		Pencil pencil = (Pencil)goods2.getObject();
		
		Goods3 goods3 = new Goods3();
		// Good3 ��ü�� Apple ��ü ����
		goods3.setObject(new Apple());
		// Class�� �ٸ�
		Pencil pencil2 = (Pencil)goods3.getObject();
	}
}
