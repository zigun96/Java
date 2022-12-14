package innerClassEx;

class OuterA {
	int a = 3;
	int b = 4;
	void abc() {
		System.out.println("A 클래스 메서드");
	}
	// 인스턴스 이너 클래스 정의
	class InnerB {
		int a = 5;
		int b = 6;
		void abc() {
			System.out.println("B 클래스 메서드");
		}
		void bcd() {
			// 이너 클래스의 맴버 호출 또는 사용
			System.out.println(a);
			System.out.println(b);
			abc();
			
			// 아우터 클래스의 맴버 호출 또는 사용
			System.out.println(OuterA.this.a);
			System.out.println(OuterA.this.b);
			OuterA.this.abc();
		}
	}
}

public class InstanceInnerClass {
	public static void main(String[] args) {
		// 아우터 클래스 객체 생성
		OuterA a = new OuterA();
		
		// 이너 클래스 객체 생성
		OuterA.InnerB b = a.new InnerB();
		b.bcd();
	}
}
