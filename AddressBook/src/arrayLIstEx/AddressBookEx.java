package arrayLIstEx;

import java.util.ArrayList;
import externalExample.ProgramInfo;
import java.util.Scanner;

public class AddressBookEx {
	public static void main(String[] args) {
		ProgramInfo.print("�ּҷ� ���α׷�", "�����", 1.0);
		ArrayList<Address> addressBook = new ArrayList<Address>();
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.print("1: ��� 2: ��ü��ȸ 3: �Ǻ���ȸ 4: ���� x: ���� ==> ");
			String code = scan.next();
			switch(code) {
				case "1": input(scan, addressBook); break;
				case "2": searchAll(); break;
				case "3": searchName(); break;
				case "4": delete(); break;
				case "x": break;
				default: System.out.println("�Է� ������ �߸� �Է��ϼ̽��ϴ�!!");
			}
			if (code.equals("x")) {
				System.out.println("**** ���α׷��� �̿��� �ּż� �����մϴ�. ****");
				ProgramInfo.print("\n�ּҷ� ���α׷�", "�����", 1.0);
				break;
			}
		}
	}

	private static void delete() {
		System.out.println("*** �ּ� ���� ó�� ***");
	}

	private static void searchName() {
		System.out.println("*** �̸����� �ּ� ��ȸ ***");
	}

	private static void searchAll() {
		System.out.println("*** ��ü �ּ� ��ȸ ***");
	}

	private static void input(Scanner scan, ArrayList<Address> addressBook) {
		System.out.println("*** �ּ� ��� ó�� ***");
		System.out.print("�̸� �Է�: ");
		String name = scan.next();
		System.out.print("��ȭ��ȣ �Է�: ");
		String phone = scan.next();
		addressBook.add(new Address(name, phone));
		int size = addressBook.size() - 1;
		String a_name = addressBook.get(size).getName();
		String a_phone = addressBook.get(size).getPhone();
		System.out.println("��� �Ϸ� ==> " + a_name + " " + a_phone);
	}
}
