package topClass;

import externalExample.ProgramInfo;

class ObjectA{
	int a = 3;
	int b = 4;
}
class ObjectB{
	int a = 3;
	int b = 4;
	public String toString() {
		return "필드값(a, b) = "+a+" "+b;
	}
}
public class ObjectMethodEx {
	public static void main(String[] args) {
		ProgramInfo.print("Object 클래스 실습", "차재건", 1.0);
		ObjectA a = new ObjectA();
		ObjectB b = new ObjectB();
		
		System.out.println("ObjectA	:" +a.toString());
		System.out.println("	:" + a);
		System.out.printf("	: %x\n",a.hashCode());
		System.out.println("ObjectB	:" +b.toString());
		System.out.println("	:" + b);
		System.out.printf("	: %x\n",b.hashCode());		
	}
}
 