package arrayExample;

import java.util.Scanner;

public class ArrayMulti {
	public static void main(String[] args) {
		// Ű���� �Է� ��ü ����
		Scanner scan = new Scanner(System.in);
		// ����, �迭 ����
		String[][] addr = new String[5][2];
		// 5���� �̸��� ID�� ���ʷ� �ޱ� ���� 5ȸ �ݺ��� ó��
		for(int i = 0; i < addr.length; i++) {
			// �̸� �Է� �ȳ� ���� ���
			System.out.printf("%d��° �л� �̸� �Է�: ",i + 1);
			// �̸� �Է� ó��
			addr[i][0] = scan.nextLine();
			// ���� �Է� �ȳ� ���� ���
			System.out.print("ID �Է�: ");
			// ���� �Է� ó��
			addr[i][1] = scan.nextLine();
		}
		scan.close();
		System.out.println("�Է��� �Ϸ�Ǿ����ϴ�!!");
		// �Է� �Ϸ� �� �迭 ���� ����ϱ� - �ݺ���
		for(int i = 0; i < addr.length; i++) {
			System.out.printf("%d��° �л�: %-5s %s\n", i + 1, addr[i][0], addr[i][1]);
		}
		System.out.print("+++ ���α׷��� �����մϴ�!! +++");
	}
}
