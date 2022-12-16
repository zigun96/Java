package ThreadEx;

public class InnerClassRunnable {
	// 기본적으로 main에는 Thread 클래스가 상속되어 있다.
	// 기본적으로 main에 Runnable 인터페이스도 구현되어 있다.
	public static void main(String[] args) throws InterruptedException {
		// 익명의 인터페이스 적용 1
		Thread trd1 = new Thread(new Runnable() {
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
		});
		// 익명의 인터페이스 적용 2
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
		// Runnable Interface에는 Start() 메소드가 없지만, Thread Class에는 존재한다.
		trd1.start();
		trd2.start();
	}
}
