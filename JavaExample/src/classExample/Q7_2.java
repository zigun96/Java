package classExample;

class Q7_2A {
	// 메서드 print() 오버로딩
	// 시그니처(매개변수 개수, 자료형)만 다르면 오버로딩이 허용된다.
	void print() {
		System.out.println("입력값이 없습니다.");
	}
	void print(int a) {
		System.out.printf("정수 입력값 : %d\n",a);
	}
	void print(double a) {
		System.out.printf("실수 입력값 : %.1f\n", a);
	}
	void print(String a) {
		System.out.printf("문자열 입력값 : %s\n", a);
	}
}

public class Q7_2 {
	public static void main(String[] args) {
		Q7_2A a = new Q7_2A();
		a.print();
		a.print(3);
		a.print(5.8);
		a.print("안녕");
	}
}
