package inheritance;
class OneDown {
	void m1() {
		System.out.println("클래스에 OneDown에 있는 메소드 m1");
	}
}
class TwoDown extends OneDown {
	void m2() {
		System.out.println("클래스에 TwoDown에 있는 메소드 m2");
	}
}
public class ClassCastingEx1 {
	public static void main(String[] args) {
		TwoDown t = (TwoDown) new TwoDown(); // 다운캐스팅
		t.m1();
		t.m2();
	}
}
