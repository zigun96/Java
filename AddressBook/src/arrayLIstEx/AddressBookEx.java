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
				case "2": searchAll(addressBook); break;
				case "3": searchName(scan, addressBook); break;
				case "4": delete(scan, addressBook); break;
				case "x": break;
				default: System.out.println("�Է� ������ �߸� �Է��ϼ̽��ϴ�!!");
			}
			if (code.equals("x")) {
				System.out.println("**** ���α׷��� �̿��� �ּż� �����մϴ�. ****");
				break;
			}
		}
	}

	private static void delete(Scanner scan, ArrayList <Address> addressBook) {
		System.out.println("*** �ּ� ���� ó�� ***");
		if(addressBook.size() <= 0) {
			System.out.println("��ϵ� ����ó�� �����ϴ�.");
		} else {
			System.out.println("�̸� �Է�: ");
			String name = scan.next();
			int cnt = 0;
			System.out.println("** ��� ��ȣ ���� **");
			for (int i = 0; i < addressBook.size(); i++) {
				if (name.equals(addressBook.get(i).getName())) {
					cnt ++;
					System.out.println(i +") " + ": " + addressBook.get(i).getPhone());
				}
			}
			if(cnt == 0) System.out.println("**** ��ϵ� ����ó�� �����ϴ�. ****");
			else {
				System.out.print("������ ��Ϲ�ȣ #) �Է�: ");
				String num = scan.next();
				System.out.println("���� �����Ͻðڽ��ϱ�? (y/n)");
				String check = scan.next();
				if (check.equals("y")) {
					// ArrayList -> key��(ù ��° ��)��, �ּҷε� ����� �� �� �ִ�.
					addressBook.remove(Integer.parseInt(num));
					System.out.println("�����Ǿ����ϴ�.");
				} else System.out.println("��� �Ǿ����ϴ�...");
			}
		}
	}

	private static void searchName(Scanner scan, ArrayList<Address> addressBook) {
		System.out.println("*** �̸����� �ּ� ��ȸ ***");
		if(addressBook.size() <= 0) {
			System.out.println("��ϵ� ����ó�� �����ϴ�.");
		} else {
			System.out.print("�̸� �Է�: ");
			String name = scan.next();
			int cnt = 0;
			for (int i = 0; i < addressBook.size(); i++) {
				if (name.equals(addressBook.get(i).getName())) {
					System.out.println(name + " : " + addressBook.get(i).getPhone());
					cnt ++;
				}
			}
			if (cnt == 0) System.out.println("��ϵ� ����ó�� �����ϴ�.");
		}
	}

	private static void searchAll(ArrayList<Address> addressBook) {
		System.out.println("*** ��ü �ּ� ��ȸ ***");
		if(addressBook.size() <= 0) {
			System.out.println("��ϵ� ����ó�� �����ϴ�.");
		}
		for (int i = 0; i < addressBook.size(); i++) {
			String a_name = addressBook.get(i).getName();
			String a_phone = addressBook.get(i).getPhone();
			System.out.println((i+1) + ") " + a_name + " " + a_phone);
		}
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
