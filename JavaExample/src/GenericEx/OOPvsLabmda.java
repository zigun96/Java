package GenericEx;

// 함수혀 인터페이스
interface A {
	abstract void abc();
}

class B implements A {
	@Override
	public void abc() {
		System.out.println("메소드 내용 1");
	}
}

public class OOPvsLabmda {
	public static void main (String[] args) {
		// 1. 일반적인 메소드 사용법
		A a1 = new B();
		a1.abc();
		
		// 2. 익명의 이너클래스 사용법, 클래스 B가 필요 없어짐
		A a2 = new A() {
			public void abc() {
				System.out.println("메서드 내용 2");
			}
		};
		a2.abc();
		
		// 3. 람다식 활용법, 객체 생성 및 메소드 구현
		A a3 = () -> System.out.println("메서드 내용 3");
		a3.abc();
	}
}
