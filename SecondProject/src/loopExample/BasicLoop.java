package loopExample;

import java.util.Scanner;

public class BasicLoop {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int num =1, sum = 0;
		System.out.print("�󸶱��� ������ ������ �Է��ϼ���(���� �� 0): ");
		num = scan.nextInt();
		scan.close();
		// num ���� 1������ ��
//		for (int i = num; i >= 1; i--) {
//				sum += i;
//		}
		// 1 ���� num���� ¦���� ��
//		for (int i = 0; i <= num; i+=2) {
//				sum += i;
//		}
		// 1 ���� num������ ��
//		for (int i = 0; i <= num; i++) {
//				sum += i;
//		}
		// 1 ���� num���� ¦���� ��
		for (int i = 0; i <= num; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}

		System.out.printf("1���� %d���� ¦���� ���� %d�Դϴ�.\n", num, sum);
	}
}
