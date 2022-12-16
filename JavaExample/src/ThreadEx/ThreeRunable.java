package ThreadEx;

// KorThread interface
class KorThread3 implements Runnable {
	public void run() {
		String[] kor = {"하나", "둘", "셋", "넷", "다섯"};
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
	// 기본적으로 main에는 Thread 클래스가 상속되어 있다.
	// 기본적으로 main에 Runnable 인터페이스도 구현되어 있다.
	public static void main(String[] args) throws InterruptedException {
		Runnable re = new EngThread3();
		// Runnable 객체를 Thread 객체로 업캐스팅함
		Thread eng = new Thread(re);
		eng.start();
		Runnable rk = new KorThread3();
		// Runnable 객체를 Thread 객체로 업캐스팅함
		Thread kor = new Thread(rk);
		kor.start();
	}
}
