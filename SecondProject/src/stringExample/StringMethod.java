package stringExample;

import java.util.Scanner;

public class StringMethod {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String indata;
		while(true) {
			System.out.print("�ֹε�Ϲ�ȣ(13�ڸ�) �Է�(���� ��x): ");
			indata = scan.next();
			if (indata.equals("x")) {
				break;
			}
			if (indata.length() != 13) {
				System.out.println("�Է� ���� : �ֹε�Ϲ�ȣ�� 13�ڸ��Դϴ�!!");
			} else {
				int month = Integer.parseInt(indata.substring(2, 4));
				if (month < 1 || month > 12) {
					System.out.println("�� �Է�����: ��������� 1 ~ 12�� �����Դϴ�!!");
				} else {
					System.out.println("�Է��� �ֹε�Ϲ�ȣ : " + indata.substring(0, 6) + "-" + indata.substring(6, 13));
					int gender = Integer.parseInt(indata.substring(6,7));
					if (gender % 2 == 0) {
						System.out.println("�����Դϴ�!!");
					} else {
						System.out.println("�����Դϴ�!!");
					}
				}		
			}
			scan.nextLine();
		}
		scan.close();
		System.out.println("���α׷��� �����մϴ�!!");
	}
}
