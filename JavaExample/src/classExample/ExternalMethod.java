package classExample;

class MethodA{
	// #. 리턴타입: void + 매개변수: 없음
	void print() {
		System.out.println("안녕");
	}
	// #. 리턴타입: int + 매개변수: 없음
	int data() {
		return 3;
	}
	// #. 리턴타입: double + 매개변수: 2개
	double sum(double a, int b) {
		return a + b;
	}
	// #. 리턴타입: void + 매개변수: 1개 + 내부 함수종료 (return 포함)
	void printMonth(int m) {
		if(m < 0 || m > 12) {
			System.out.println("잘못된 입력!");
			// 반환값은 없지만 return 자체는 쓸수 있다.
			return;
		}
		System.out.println(m + "월 입니다.");
	}
}

public class ExternalMethod {
	public static void main(String[] args) {
		// 객체 생성
		MethodA a = new MethodA();
		
		// 참조 변수로부터 메서드 호출
		a.print(); // "안녕"
		
		int k = a.data();
		a.data();
		System.out.println(k); // 3
		
		double result = a.sum(5.2, 3);
		System.out.println(result); // 8.2
		
		a.printMonth(5); // 5월 입니다.
		a.printMonth(15); // 잘못된 입력
	}
}
