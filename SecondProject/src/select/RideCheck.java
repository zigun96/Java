package select;
//Scanner Ŭ���� ����ϱ� ���� ����Ʈ
import java.util.Scanner;

public class RideCheck {
	public static void main(String[] args) {
		// Ŭ���� ���� ���
		System.out.println("++++++++++++++++++++++++++");
		System.out.println("+  ���̱ⱸ ž�� ���� ���α׷�	 +");
		System.out.println("+   	������: �����		 +");
		System.out.println("+  		 �� ��: 1.0	  	 +");
		System.out.println("++++++++++++++++++++++++++");
		// scanner ��ü ����
		Scanner scan = new Scanner(System.in);
		// �ʿ� ���� ����
		double height, weight;
		// �Է� ó��
		System.out.print("Ű �Է�(cm): ");
		height = scan.nextDouble();
		System.out.print("������ �Է�(kg): ");
		weight = scan.nextDouble();
		// ��ĳ�� �ݱ�
		scan.close();
		// �Ǵ� �� ���
		if (height <= 190 && weight < 120) {
			System.out.println("�������, ��ſ� �ð��Ǽ���.");
		}else {
			System.out.println("Ű�� 190cm�� �Ѿ� �� ���̱ⱸ�� ž���� �� �����ϴ�.");
			System.out.println("�����԰� 120kg�� �Ѿ� �� ���̱ⱸ�� ž���� �� �����ϴ�.");
		}
		// ���� ���� ���
		System.out.println("���α׷��� �����մϴ�.");
	}
}
