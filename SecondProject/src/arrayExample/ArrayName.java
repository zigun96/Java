package arrayExample;

import java.util.Scanner;

public class ArrayName {
	public static void main(String[] args) {
		// Ű���� �Է� ��ü ����
		Scanner scan = new Scanner(System.in);
		// ����, �迭 ����
		String[] name = new String[5];
		// 5���� �̸��� ���ʷ� �ޱ� ���� 5ȸ �ݺ��� ó��
		for(int i = 0; i < 5; i++) {
			// �Է� �ȳ� ���� ���
			System.out.printf("%d��° �л� �̸� �Է�: ",i + 1);
			// �Է� ó��
			name[i] = scan.nextLine();
		}
		scan.close();
		System.out.println("�̸� �Է��� �Ϸ�Ǿ����ϴ�!!");
		// �Է� �Ϸ� �� �迭 ���� ����ϱ� - �ݺ���
		for(int i = 0; i < 5; i++) {
			System.out.printf("%d��° �л� �̸�: %s\n",i + 1, name[i]);
		}
		System.out.print("+++ ���α׷��� �����մϴ�!! +++");
	}
}
