package select;
// Scanner Ŭ���� ����ϱ� ���� ����Ʈ
import java.util.Scanner;

public class Elevator {
	public static void main(String[] args) {
		// ��ĳ�� ��ü ����
		Scanner scan = new Scanner(System.in);
		// �ʿ� ���� ����
		int floor;
		String info="";
		// �Է� ó��
		System.out.print("���� �Է�(1 ~ 5): ");
		floor = scan.nextInt();
		scan.close();
		// switch-case ������ ����
		switch (floor) {
		case 1:
				info = "�౹";
				break;
		case 2:
				info = "�����ܰ�";
				break;
		case 3:
				info = "�Ǻΰ�";
				break;
		case 4:
				info = "ġ��";
				break;
		case 5:
				info = "�ｺŬ��";
				break;
		default:
				info = "�����Է�";
		}
		// if~else if~else ������ ����
//		if(floor == 1) info = "�౹";
//		else if(floor == 2) info = "�����ܰ�";
//		else if(floor == 3) info = "�Ǻΰ�";
//		else if(floor == 4) info = "ġ��";
//		else if(floor == 5) info = "�ｺŬ��";
//		else info = "�����Է�";
		// ���� �޼��� ���
		System.out.println(floor+"��: "+info+"�Դϴ�.");
		System.out.println("*** ���α׷��� �����մϴ�. ***");
	}
}
