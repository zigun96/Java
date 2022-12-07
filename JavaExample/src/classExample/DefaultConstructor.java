package classExample;

class DefaultA {
	int m;
	void work() {
		System.out.println(m);
	}
	// 기본 생성자 자동 추가(A){}
}

class DefaultB {
	int m;
	void work() {
		System.out.println(m);
	}
	DefaultB() { // 기본 생성자
	}
}

class DefaultC {
	int m;
	void work() {
		System.out.println(m);
	}
	DefaultC(){} // 기본 생성자
	DefaultC(int a) { // 생성자 오버로딩 
		m = a;
	}
}

public class DefaultConstructor {
	public static void main(String[] args) {
		// #1. 기본 생성자를 이용한 객체 생성
		DefaultA a = new DefaultA();
		DefaultB b = new DefaultB();
		DefaultC c = new DefaultC(3);
		DefaultC d = new DefaultC(); // 오류 (기본 생성자 없음)
		
		// #2. 메서드 호출
		a.work(); // 0
		b.work(); // 0
		c.work(); // 3
		d.work(); // 0
	}
}
