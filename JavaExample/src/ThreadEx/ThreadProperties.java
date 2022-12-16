package ThreadEx;

public class ThreadProperties {
	public static void main(String[] args) throws InterruptedException{
		// static method
		System.out.println("동작 중 쓰레드 갯수: " + Thread.activeCount());
		Thread curThread = Thread.currentThread();
		// non-static method
		System.out.println("현재 쓰레드 이름: " + curThread.getName());
		for (int i = 0; i < 3; i++) {
			Thread thread = new Thread();
			// setter, getter의 기능이 있음
			// 이름 형식을 변경
			thread.setName(i + "번째 쓰레드");
			System.out.println("쓰레드 이름: " + thread.getName());
			thread.start();
		}
		for (int i = 0; i < 3; i++) {
			Thread thread = new Thread();
			System.out.println("쓰레드 이름: " + thread.getName());
			thread.start();
		}
		
		System.out.println("동작 중 쓰레드 갯수: " + Thread.activeCount());
	}
}
