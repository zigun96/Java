package loopExample;

public class GugudanAll {
	public static void main(String[] args) {
		System.out.println("++++++++++++++++++++++++++");
		System.out.println("+    ������ ��� ���α׷�     +");
		System.out.println("+   	������: �����		 +");
		System.out.println("+  		 �� ��: 1.0	  	 +");
		System.out.println("++++++++++++++++++++++++++");
		
		for (int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.printf("%2d X %2d = %2d ", j, i, j * i);
			}
			System.out.print("\n");
		}
		System.out.print("*** ���α׷��� �����մϴ� ***");
	}
}
