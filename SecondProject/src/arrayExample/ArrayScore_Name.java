package arrayExample;

import java.util.Scanner;

public class ArrayScore_Name {
	public static void main(String[] args) {
		// Ű���� �Է� ��ü ����
		Scanner scan = new Scanner(System.in);
		// ����, �迭 ����
		int[] jumsu = new int[5];
		String[] name = new String[5];
		int sum = 0;
		double avg = 0;
		// 5���� �̸��� ������ ���ʷ� �ޱ� ���� 5ȸ �ݺ��� ó��
		for(int i = 0; i < 5; i++) {
			// scan.nextInt()�� ������ ���๮�� ó���� ���� ����
			scan.nextLine();
			// �̸� �Է� �ȳ� ���� ���
			System.out.printf("%d��° �л� �̸� �Է�: ",i + 1);
			// �̸� �Է� ó��
			name[i] = scan.nextLine();
			// ���� �Է� �ȳ� ���� ���
			System.out.print("���� �Է�: ");
			// ���� �Է� ó��
			jumsu[i] = scan.nextInt();
		}
		scan.close();
		System.out.println("�Է��� �Ϸ�Ǿ����ϴ�!!");
		// �Է� �Ϸ� �� �迭 ���� ����ϱ� - �ݺ���
		System.out.println("++++ �л� �� ���� ++++");
		for(int i = 0; i < 5; i++) {
			sum += jumsu[i];
			System.out.printf("%s		: %d\n",name[i], jumsu[i]);
		}
		avg = (double)sum / jumsu.length ;
		System.out.printf("����: %d\n",sum);
		System.out.printf("���: %.1f\n",avg);
		System.out.print("+++ ���α׷��� �����մϴ�!! +++");
	}
}
