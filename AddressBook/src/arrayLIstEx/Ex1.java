package arrayLIstEx;

import externalExample.ProgramInfo;
import java.util.ArrayList;

public class Ex1 {
	public static void main(String[] args) {
		ProgramInfo.print("ArrayList �ǽ�", "�����", 1.0);
		ArrayList<String> aList1 = new ArrayList<String>();
		
		// ArrayList�� �Է��ϱ�
		aList1.add("������");
		aList1.add("ȫ�浿");
		aList1.add("������");
		
		// ArrayList ���� ���
		System.out.println(aList1);
		
		// ArrayList 1��° ���� ���
		System.out.println(aList1.get(0));
		
		// ArrayList�� �����Ű� �ִ��� ��ȸ�Ͽ� ���
		int cnt = 0;
		for (int i = 0; i < aList1.size(); i++) {
			if (aList1.get(i) == "������") {
				cnt += 1;
				System.out.println(aList1.get(i));
			}
		}
		
		if (cnt == 0) System.out.println("�ڷᰡ �����ϴ�.");
		
		// ù ��° �����Ÿ� ���������� �ٲٱ�
		aList1.set(0,"������");
		System.out.println(aList1);
		
		// �������� �����
		aList1.remove("������");
		System.out.println(aList1);
		
		System.out.println("=".repeat(36));
		
		// �� �̸� 2�� �ֱ�
		aList1.add("�����");
		aList1.add("�����");
		
		// ArrayList ��ü ���
		System.out.println(aList1);
		
		// ������� �����
		aList1.remove("�����");
		
		// ArrayList�� ������� �ִ��� ��ȸ�Ͽ� ���
		int chaCnt = 0;
		for (int i = 0; i < aList1.size(); i++) {
			if (aList1.get(i) == "�����") {
				chaCnt += 1;
				System.out.println(aList1.get(i));
			}
		}
		
		if (chaCnt == 0) System.out.println("�ڷᰡ �����ϴ�.");

		// ArrayList ��ü ���
		System.out.println(aList1);
	}
}
