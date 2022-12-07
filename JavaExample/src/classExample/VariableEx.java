package classExample;

public class VariableEx {
	static int sval = 100; // 클래스변수 = 스태틱변수
	int ival = 200; // 필드 = 인스턴스변수 = 객체형변수 = 맴버변수
	public static void main(String[] args) {
		// 설계 당시 클래스 영역에 변수를 박아놨기 때문에 호출할 수 있음
		System.out.println("sval: " + sval);
		// 설계도로 객체를 만들기 전이라 변수가 아직 메모리에 할당되지 않음 
//		System.out.println("ival: " + ival);
		
		VariableEx ex1 = new VariableEx();
		VariableEx ex2 = new VariableEx();
		System.out.println("ex1 ival: " + ex1.ival);
		System.out.println("ex2 ival: " + ex2.ival);
		
		
		ex1.ival = 300;
		System.out.println("ex1 ival: " + ex1.ival);
		System.out.println("ex2 ival: " + ex2.ival);
		
		int ival = 400; // 지역변수 = 로컬변수
		System.out.println("ival: "+ ival);
	}
}
