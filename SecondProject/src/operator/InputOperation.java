package operator;

import java.util.Scanner;

public class InputOperation {
	public static void main(String[] args) {
		// Ŭ���� ���� ���
		System.out.println("++++++++++++++++++++++++++");
		System.out.println("+ ���� ��� ���α׷�	 +");
		System.out.println("+   ������: �����	 +");
		System.out.println("+   �� ��: 1.0  	 +");
		System.out.println("++++++++++++++++++++++++++");
		// scanner ��ü ����
		Scanner scan = new Scanner(System.in);
		// �ʿ� ���� ����
		double korScore, engScore, mathScore, scScore, totalScore;
		double avgScore;
		String honorMessage;
		// �Է� ó��
		System.out.print("���� ���� �Է�: ");
		korScore = scan.nextDouble();
		System.out.print("���� ���� �Է�: ");
		engScore = scan.nextDouble();
		System.out.print("���� ���� �Է�: ");
		mathScore = scan.nextDouble();
		System.out.print("���� ���� �Է�: ");
		scScore = scan.nextDouble();
		scan.close();
		// ���
		totalScore = korScore + engScore + mathScore + scScore;
		avgScore = totalScore / 4;
		honorMessage = avgScore >= 90 ? "�����Դϴ�." : "�����߾��!";
		// ���
		System.out.println("����: "+totalScore);
		System.out.printf("���: %.1f",avgScore);
		System.out.println();
		System.out.println(honorMessage);
		
		// ���� ���� ���
		System.out.println("���α׷��� �̿��� �ּż� �����մϴ�!");
	}
}
