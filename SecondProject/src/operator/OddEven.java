package operator;
// Scanner Ŭ���� ����ϱ� ���� ����Ʈ
import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		// Ŭ���� ���� ���
		System.out.println("++++++++++++++++++++++++++");
		System.out.println("+ Ȧ¦ ���� ���α׷�	 +");
		System.out.println("+   ������: �����	 +");
		System.out.println("+   �� ��: 1.0  	 +");
		System.out.println("++++++++++++++++++++++++++");
		// scanner ��ü ����
		Scanner scan = new Scanner(System.in);
		// �ʿ� ���� ����
		String inputNum;
		int num;
		String outputMessage;	
		// �Է� ó��
		System.out.print("���� �Է�: ");
		inputNum = scan.nextLine();
		// ��ĳ�� �ݱ�
		scan.close();
		// �� ��ȯ
		num = Integer.parseInt(inputNum);
		// Ȧ¦ �Ǵ�
		//outputMessage = num % 2 == 0? "¦���Դϴ�." : "Ȧ���Դϴ�.";
		if ( num % 2 == 0) outputMessage = "¦���Դϴ�.";
		else outputMessage = "Ȧ���Դϴ�.";
		// ��� ���
		System.out.println(outputMessage);
		// ���� �ȳ� �޼���
		System.out.println("���α׷��� �̿��� �ּż� �����մϴ�.");
	}
}
