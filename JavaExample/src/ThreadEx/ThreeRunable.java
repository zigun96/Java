package ThreadEx;

// KorThread interface
class KorThread3 implements Runnable {
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
}
// EngThread interface
class EngThread3 implements Runnable {
	public void run() {
		String[] eng = {"One", "Two", "Three", "Four", "Five"};
		for (int i = 0; i < eng.length; i++) {
			System.out.print(eng[i]+" : ");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {}
		}
	}
}

public class ThreeRunable {
	// �⺻������ main���� Thread Ŭ������ ��ӵǾ� �ִ�.
	// �⺻������ main�� Runnable �������̽��� �����Ǿ� �ִ�.
	public static void main(String[] args) throws InterruptedException {
		Runnable re = new EngThread3();
		// Runnable ��ü�� Thread ��ü�� ��ĳ������
		Thread eng = new Thread(re);
		eng.start();
		Runnable rk = new KorThread3();
		// Runnable ��ü�� Thread ��ü�� ��ĳ������
		Thread kor = new Thread(rk);
		kor.start();
	}
}
