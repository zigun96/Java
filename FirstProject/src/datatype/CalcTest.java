package datatype;

import java.util.Scanner;

public class CalcTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int iNum1, iNum2;
//		�Է�
		System.out.print("ù ��° ���� �Է�: ");
		iNum1 = scan.nextInt();
		System.out.print("�� ��° ���� �Է�: ");
		iNum2 = scan.nextInt();
		scan.close();
//		���
		System.out.printf("1.%d / %d = %.2f\n", iNum1, iNum2, (float)iNum1 / iNum2);
		System.out.printf("2.%d / %d = %.2f\n", iNum1, iNum2, iNum1 / (float)iNum2);
		System.out.printf("3.%d / %d = %.2f\n", iNum1, iNum2, (float)(iNum1 / iNum2));
		System.out.printf("4.%d / %d = %d\n", iNum1, iNum2, iNum1 / iNum2);
		
	}
}
