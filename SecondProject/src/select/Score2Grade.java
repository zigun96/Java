package select;
// ��Ű��, Ŭ���� �ҷ�����
import java.util.Scanner;

public class Score2Grade {
	public static void main(String[] args) {
		// Ŭ���� ���� ���
		System.out.println("++++++++++++++++++++++++++");
		System.out.println("+     ���� ��� ���α׷�	     +");
		System.out.println("+   	������: �����		 +");
		System.out.println("+  		 �� ��: 1.0	  	 +");
		System.out.println("++++++++++++++++++++++++++");
		
		// ���� ���� �� ��ü ����
		Scanner scan = new Scanner(System.in);
		int score = 0;
		String grade = "";
		// �Է�
		System.out.print("���� �Է�: ");
		score = scan.nextInt();
		scan.close();
		// switch-case ������ ����
		switch (score / 5) {
		case 20:
		case 19:
			grade = "A+";
			break;
		case 18:
			grade = "A";
			break;
		case 17:
			grade = "B+";
			break;
		case 16:
			grade = "B";
			break;
		case 15:
			grade = "C+";
			break;
		case 14:
			grade = "C";
			break;
		case 13:
			grade = "D+";
			break;
		case 12:
			grade = "D";
			break;
		default:
			grade = "F";
		}
		// ���ǿ� ���� ����ڷ� ���� - �ܼ� if�� 5��
//		if(score >= 90)grade = 'A';
//		else if(score >= 80)grade = 'B';
//		else if(score >= 70)grade = 'C';
//		else if(score >= 60)grade = 'D';
//		else grade = 'F';
		// ��� ó��
		System.out.println(score+"���� "+grade+"�Դϴ�.");
	}
}
