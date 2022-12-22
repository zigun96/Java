package GenericEx;

class GenericMethods {
	public <T> T method1(T t) {
		return t;
	}
	public <T> boolean method2(T t1, T t2) {
		return t1.equals(t2);
	}
	public <T1, T2> void method3(T1 k, T2 v) {
		System.out.println(k + " : " + v);
	}
}

public class GenericMethod {
	public static void main(String[] args) {
		 GenericMethods gm = new GenericMethods();
		 // 반환값 지정
		 String str1 = gm.<String>method1("안녕");
		 // 반환값 미지정 => 알아서 지정해줌
		 String str2 = gm.method1("안녕");
		 // int num = gm.<Int>method1(100);
		 int num = gm.method1(100);
		 System.out.println(str1 + " : " + num + " : " + str2);
		 
		 boolean boo1 = gm.<Double>method2(25.0, 25.0);
		 boolean boo2 = gm.method2(2, 25);
		 System.out.println(boo1 + " : " + boo2);
		 
		 // 제네릭으로 정의된 메서드에 인수를 넣으면 알아서 맞는 타입을 지정해줌 
		 gm.<String, Integer>method3("국어", 100);
		 gm.method3(100, "영어");
	}
}
