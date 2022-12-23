package lambdaEx;

interface C {
	int abc (String str);
}

public class InstanceMethod2 {
	public static void main(String[] args) {
		// 1.익명의 이너클래스
		C a1 = new C() {
			@Override
			public int abc(String str) {
				return str.length();
			}
		};
		
		// 2.람다식
		C a2 = (String str) -> str.length();
		
		// 3.자바제공 인스턴스메서드 참조
		C a3 = a1::abc;
		
		// 출력
		System.out.println(a1.abc("안녕하세요!"));
		System.out.println(a2.abc("안녕하세요!"));
		System.out.println(a3.abc("안녕하세요!"));
	}
}
