package datatype;

import java.util.Scanner;

public class ScannerTest1 {
	public static void main(String[] args) {
		// Ű���� �Է� ��ġ ��� ���(���� ��ü ����)
		Scanner scanner = new Scanner(System.in);
		
		// ��� ���� ����
		int iNum = 0;
		double dNum = 0;
		String sInput = "";
		
		// �Է� �ȳ����� ���
		System.out.print("���� �Է�: ");
		// ���� �Է��Ͽ� ������ ����
		iNum = scanner.nextInt();
				
		// �Է� �ȳ����� ���
		System.out.print("�Ǽ� �Է�: ");
		// �Ǽ� �Է��Ͽ� ������ ����
		dNum = scanner.nextDouble();
		scanner.nextLine();
		
		// �Է� �ȳ����� ���
		System.out.print("�ܾ�/���� �Է�: ");
		// �ܾ�/���� �Է��Ͽ� ������ ����
		sInput = scanner.nextLine();
		
		// �Է� ��ġ �ݱ�
		scanner.close();
		
		// ����� ������ �̿��Ͽ� ���� ���
		System.out.println("-------------");
		System.out.println(iNum);
		System.out.println(dNum);
		System.out.println(sInput);
	}
}
