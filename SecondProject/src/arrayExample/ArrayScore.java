package arrayExample;

import java.util.Scanner;

public class ArrayScore {
	public static void main(String[] args) {
		// Ű���� �Է� ��ü ����
		Scanner scan = new Scanner(System.in);
		// ����, �迭 ����
		int[] jumsu = new int[5];
		int sum = 0;
		double avg = 0;
		// 5���� ������ ���ʷ� �ޱ� ���� 5ȸ �ݺ��� ó��
		for(int i = 0; i < 5; i++) {
			// �Է� �ȳ� ���� ���
			System.out.printf("%d��° �л� ���� �Է�: ",i + 1);
			// �Է� ó��
			jumsu[i] = scan.nextInt();
		}
		scan.close();
		System.out.println("���� �Է��� �Ϸ�Ǿ����ϴ�!!");
		// �Է� �Ϸ� �� �迭 ���� ����ϱ� - �ݺ���
		for(int i = 0; i < 5; i++) {
			sum += jumsu[i];
			System.out.printf("%d��° �л� ����: %d\n",i + 1, jumsu[i]);
		}
		avg = (double)sum / jumsu.length ;
		System.out.printf("����: %d\n",sum);
		System.out.printf("���: %.1f\n",avg);
		System.out.print("+++ ���α׷��� �����մϴ�!! +++");
	}
}
