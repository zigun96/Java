package exceptionEx;

public class Arithmetic {
	public static void main(String[] args) {
		try{
			System.out.println(3/0);
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		System.out.println("���α׷��� �����մϴ�.");
	}
}
