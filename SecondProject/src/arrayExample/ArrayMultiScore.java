package arrayExample;

import java.util.Scanner;

public class ArrayMultiScore {
	public static void main(String[] args) {
		// Ű���� �Է� ��ü ����
		Scanner scan = new Scanner(System.in);
		// ����, �迭 ����
		int[][] jumsu = new int[3][2];
		String[] name = new String[3];
		int []sum = new int[2];
		double []avg = new double[2];
		// 5���� �̸��� ������ ���ʷ� �ޱ� ���� 5ȸ �ݺ��� ó��
		for(int i = 0; i < name.length; i++) {
			// scan.nextInt()�� ������ ���๮�� ó���� ���� ����
			scan.nextLine();
			// �̸� �Է� �ȳ� ���� ���
			System.out.printf("%d��° �л� �̸� �Է�: ",i + 1);
			// �̸� �Է� ó��
			name[i] = scan.nextLine();
			// ���� ���� �Է� �ȳ� ���� ���
			System.out.print("���� ���� �Է�: ");
			// ���� ���� �Է� ó��
			jumsu[i][0] = scan.nextInt();
			// �ڹ� ���� �Է� �ȳ� ���� ���
			System.out.print("�ڹ� ���� �Է�: ");
			// �ڹ� ���� �Է� ó��
			jumsu[i][1] = scan.nextInt();
			
		}
		scan.close();
		System.out.println("�Է��� �Ϸ�Ǿ����ϴ�!!");
		// �迭 ������� �� ���� ���
		System.out.println("++++ �л� �� ���� ++++");
		System.out.println("\t ���� �ڹ�");
		for(int i = 0; i < name.length; i++) {
			sum[0] += jumsu[i][0]; sum[1] += jumsu[i][1];
			System.out.printf("%s\t: %d %d\n",name[i], jumsu[i][0], jumsu[i][1]);
		}
		// ��� ���
		avg[0] = (double)sum[0] / jumsu.length ;
		avg[1] = (double)sum[1] / jumsu.length;
		// ����, ���, ���� �ȳ� ���� ���
		System.out.printf("����\t: %d %d\n", sum[0], sum[1]);
		System.out.printf("���\t: %.1f %.1f\n", avg[0], avg[1]);
		System.out.print("+++ ���α׷��� �����մϴ�!! +++");
	}
}
