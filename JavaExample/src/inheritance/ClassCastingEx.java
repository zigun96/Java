package inheritance;

class One {
	void m1() {
		System.out.println("클래스 one에 있는 m1 메소드");
	}
}
class Two extends One {
	void m1() {
		System.out.println("클래스 two에 있는 m1 메소드");
	}
}
public class ClassCastingEx {
	public static void main(String[] args) {
		One o = (One)new Two(); // 업캐스팅(One)을 삭제해도 자동으로 업캐스팅.
		o.m1();
		// o.m2(); // Compile-time error message.
		((Two) o).m1(); // Compile-time error message.

	}

}
