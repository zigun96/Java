package loopExample;

import java.util.Scanner;

public class AddLoop {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int num = 1, evenSum = 0, oddSum = 0, mSum = 0;
		while(true){
			evenSum = 0; oddSum = 0; mSum = 0;
			System.out.print("�󸶱��� ������ ������ �Է��ϼ���(���� �� 0): ");
			num = scan.nextInt();
			if (num == 0) break;
			for (int i = 0; i <= num; i++) {
				if(i % 2 == 0) {
					evenSum += i;
				}else {
					oddSum += i;	
				}
				if(i % 3 == 0) {
					mSum += i;
				}
			}
			System.out.printf("1���� %d���� ¦���� ���� %d�Դϴ�.\n", num, evenSum);
			System.out.printf("1���� %d���� Ȧ���� ���� %d�Դϴ�.\n", num, oddSum);
			System.out.printf("1���� %d���� 3�� ����� ���� %d�Դϴ�.\n", num, mSum);
		}scan.close();
		System.out.print("*** ���α׷��� �����մϴ�. ***");
	}
}
