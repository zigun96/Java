package lambdaEx;

interface A2 {
	// B2 type의 추상메서드
	B2 abc();
}
interface A3 {
	// B2 type의 추상메서드
	B2 abc(int k);
}
interface A4 {
	// B2 type의 추상메서드
	B2 abc(String s);
}
class B2 {
	B2() {
		System.out.println("첫 번째 생성자");
	}
	B2(int k) {
		System.out.println("두 번째 생성자");
	}
	B2(String s) {
		System.out.println(s + " 세 번째 생성자");
	}
}

public class ClassConstructor {
	public static void main(String[] args) {
		// 1.익명의 이너클래스
		A2 a1 = new A2() {
			public B2 abc() {
				// B2() 기본생성자 리턴
				return new B2();
			}
		};
		
		// 2.람다식, A2의 B2 type 추상메서드 구현 => B2() 기본생성자 리턴
		A2 a2 = () -> new B2();
		// 클래스 타입과 생성자 간의 매개변수 자료타입을 맞춰줘야 한다.
		// 3.클래스 생성자() 참조 
		A2 a3 = B2::new;
		
		// 4.클래스 생성자(매개변수) 참조
		A3 a4 = B2::new;
		
		// 5.클래스 생성자(매개변수) 참조
		A4 a5 = B2::new;
		
		a1.abc();
		a2.abc();
		a3.abc();
		a4.abc(5);
		a5.abc("바보");
	}
}
