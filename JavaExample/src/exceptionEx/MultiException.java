package exceptionEx;

public class MultiException {
	public static void main(String[] args) {
		try {
			System.out.println(3/0);
//			System.out.println(3/3);
			int a = Integer.parseInt("20A");
//			int b = Integer.parseInt("20");
		} catch (ArithmeticException e) {
			System.out.println("0���� ������ �����ϴ�.");
		} catch (NumberFormatException e) {
			System.out.println("������ ����ȯ�� ���ڸ� �����մϴ�.");
		} finally {
			System.out.println("���α׷��� �����մϴ�.");
		}
	}
}
