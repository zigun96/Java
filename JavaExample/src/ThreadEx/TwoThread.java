package ThreadEx;

// korThread
class KorThread1 extends Thread {
	public void run() {
		String[] kor = {"�ϳ�", "��", "��", "��", "�ټ�"};
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		}
		for (int i = 0; i < kor.length; i++) {
			System.out.println(kor[i]);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}

public class TwoThread {
	// �⺻������ main Thread�� �����ȴ�.
	public static void main(String[] args) throws InterruptedException {
		Thread two = new KorThread1();
		two.start();
		String[] eng = {"One", "Two", "Three", "Four", "Five"};
		for (int i = 0; i < eng.length; i++) {
			System.out.print(eng[i]+" : ");
			Thread.sleep(1000);
		}
		
	}
}
