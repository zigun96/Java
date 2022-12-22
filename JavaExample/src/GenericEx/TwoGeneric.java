package GenericEx;

class KeyValue<A, B>{
	private A var1;
	private B var2;
	public A getVar1() {
		return var1;
	}
	public void setVar1(A var1) {
		this.var1 = var1;
	}
	public B getVar2() {
		return var2;
	}
	public void setVar2(B var2) {
		this.var2 = var2;
	}
}

public class TwoGeneric {
	public static void main(String[] args) {
		KeyValue<String, Integer> kv1 = new KeyValue<>();
		kv1.setVar1("���");
		kv1.setVar2(10000);
		String name = kv1.getVar1();
		int price = kv1.getVar2();
		System.out.println("�̸�: " + name + ", ����: " + price);
		
		KeyValue<Integer, String> kv2 = new KeyValue<>();
		kv2.setVar1(100);
		kv2.setVar2("���׽ý�");
		int no = kv2.getVar1();
		String car_name = kv2.getVar2();
		System.out.println("��ǰ��ȣ: " + no + ", ����: " + car_name);
		
		KeyValue<String, Void> kv3 = new KeyValue<>();
		kv3.setVar1("ù ��° ������ ���");
		String message = kv3.getVar1();
		System.out.println("ù ��° ������: " + message);
	}
}
