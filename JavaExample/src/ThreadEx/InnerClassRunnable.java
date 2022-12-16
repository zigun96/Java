package ThreadEx;

public class InnerClassRunnable {
	// �⺻������ main���� Thread Ŭ������ ��ӵǾ� �ִ�.
	// �⺻������ main�� Runnable �������̽��� �����Ǿ� �ִ�.
	public static void main(String[] args) throws InterruptedException {
		// �͸��� �������̽� ���� 1
		Thread trd1 = new Thread(new Runnable() {
			public void run() {
				String[] kor = {"�ϳ�", "��", "��", "��", "�ټ�"};
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {}
				for (int i = 0; i < kor.length; i++) {
					System.out.println(kor[i]);
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {}
				}
			}
		});
		// �͸��� �������̽� ���� 2
		Thread trd2 = new Thread(new Runnable() {
			public void run() {
				String[] eng = {"One", "Two", "Three", "Four", "Five"};
				for (int i = 0; i < eng.length; i++) {
					System.out.print(eng[i]+" : ");
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {}
				}
			}
		});
		// Runnable Interface���� Start() �޼ҵ尡 ������, Thread Class���� �����Ѵ�.
		trd1.start();
		trd2.start();
	}
}
