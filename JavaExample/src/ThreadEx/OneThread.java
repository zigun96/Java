package ThreadEx;

public class OneThread {
	public static void main(String[] args) throws InterruptedException {
		String[] eng = {"One", "Two", "Three", "Four", "Five"};
		String[] kor = {"�ϳ�", "��", "��", "��", "�ټ�"};
		for (int i = 0; i < eng.length; i++) {
			System.out.println("����: " + eng[i]);
			Thread.sleep(1000);
		}
		for (int i = 0; i < kor.length; i++) {
			System.out.println("�ѱ�: " + kor[i]);
			Thread.sleep(1000);
		}
	}
}
