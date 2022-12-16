package ThreadEx;

public class ThreadProperties {
	public static void main(String[] args) throws InterruptedException{
		// static method
		System.out.println("���� �� ������ ����: " + Thread.activeCount());
		Thread curThread = Thread.currentThread();
		// non-static method
		System.out.println("���� ������ �̸�: " + curThread.getName());
		for (int i = 0; i < 3; i++) {
			Thread thread = new Thread();
			// setter, getter�� ����� ����
			// �̸� ������ ����
			thread.setName(i + "��° ������");
			System.out.println("������ �̸�: " + thread.getName());
			thread.start();
		}
		for (int i = 0; i < 3; i++) {
			Thread thread = new Thread();
			System.out.println("������ �̸�: " + thread.getName());
			thread.start();
		}
		
		System.out.println("���� �� ������ ����: " + Thread.activeCount());
	}
}
