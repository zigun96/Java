package classExample;

class Name {
	String name = "홍길동";
	void namePrint() {
		System.out.println("프로그램 개발자 정보: " + name);
	}
}

public class ClassEx01 {
	public static void main(String[] args) {
		Name n = new Name();
		
//		n.name = "차재건";
		System.out.println(n.name);
		n.name = "차재건";
		n.namePrint();
	}
}
