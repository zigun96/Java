package datatype;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		System.out.println("++++++++++++++++++++++++++");
		System.out.println("+    ������ ��� ���α׷�     +");
		System.out.println("+   	������: �����		 +");
		System.out.println("+  		 �� ��: 1.0	  	 +");
		System.out.println("++++++++++++++++++++++++++");
		Scanner scanner = new Scanner(System.in);
		int dan = 2;
		System.out.print("����� �������� ���� �Է����ּ���: ");
		try {
			dan = scanner.nextInt();
		}
		catch (InputMismatchException e) {
//			System.out.println(e);
			System.out.println("�Է� ����... ������ �Է��ϼ���!!");
		}finally {
			scanner.close();	
		}
//		for (int i = 2; i <= dan; i++) {
		if(dan >= 2 && dan < 10) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %2d\n", dan, j, dan * j);
			}
		}else {
			System.out.print("������ 2�� ~ 9�ܱ����� �̿��ϼ���!");
		}
//		System.out.print("======================\n");
//		}
	}
}
