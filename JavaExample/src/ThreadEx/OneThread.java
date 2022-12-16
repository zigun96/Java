package ThreadEx;

public class OneThread {
	public static void main(String[] args) throws InterruptedException {
		String[] eng = {"One", "Two", "Three", "Four", "Five"};
		String[] kor = {"하나", "둘", "셋", "넷", "다섯"};
		for (int i = 0; i < eng.length; i++) {
			System.out.println("영어: " + eng[i]);
			Thread.sleep(1000);
		}
		for (int i = 0; i < kor.length; i++) {
			System.out.println("한글: " + kor[i]);
			Thread.sleep(1000);
		}
	}
}
