package select;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		// ���� ����, ��ü ����
		int num1 = 0, num2 = 0;
		double result = 0;
		char operator;
		Scanner scan = new Scanner(System.in);
		while(true) {
			// �Է�
			System.out.print("������ �Է� (+, -, *, /), ���� Ű���� 'x': ");
			operator = scan.next().charAt(0);
			if( operator == 'x') break;
			try {
				// �Է�
				System.out.print("ù ��° ����(����) �Է�: ");
				num1 = scan.nextInt();
				System.out.print("�� ��° ����(����) �Է�: ");
				num2 = scan.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.println(e);
				System.out.println("����� ���ڴ� ������ �Է����ּ���!!");
//				break;
				System.exit(0);
			}
			// switch-case������ ����
			switch(operator) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = (double)num1 / num2;
				break;
			default:
				System.out.print("������ [+, -, *, /] Ȥ�� ���� Ű���� 'x'�� �Է����ּ���.\n");	
				continue;
			}
			// ��� �޼��� ���
			System.out.printf("%d %c %d = %.2f\n",num1, operator, num2, result);
		}
		// ��ĳ�� �ݱ�
		scan.close();
		// ���� �޼��� ���
		System.out.println("���α׷��� �����մϴ�.");
	}
}
