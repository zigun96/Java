package innerClassEx;

class OuterA1 {
	static int a = 3;
	static int b = 4;
	static void method1() {
		System.out.println("Instance method");
	}
	static void method2() {
		System.out.println("static method");
	}
	// 정적 이너 클래스
	static class InnerB1 {
		int a = 99;
		void bcd() {
			// 필드 사용
			System.out.println(a);
			System.out.println(b);
			// 메서드 호출
			method1();
			method2();
		}
	}
}

public class StaticInnerClass {
	public static void main(String[] args) {
		// 정적 이너 클래스의 객체 생성
		OuterA1.InnerB1 b = new OuterA1.InnerB1();
		// 메서드 호출
		b.bcd();
	}
}
