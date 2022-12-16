package ThreadEx;

// KorThread
class KorThread2 extends Thread {
	public void run() {
		String[] kor = {"하나", "둘", "셋", "넷", "다섯"};
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
		}
		for (int i = 0; i < kor.length; i++) {
			System.out.println(kor[i]);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {}
		}
	}
}
// EngThread
class EngThread extends Thread {
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

public class ThreeThread {
	// 기본적으로 main Thread는 생성된다.
	public static void main(String[] args) throws InterruptedException {
		Thread eng = new EngThread();
		eng.start();
		Thread kor = new KorThread2();
		kor.start();
	}
}
