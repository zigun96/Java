package arrayLIstEx;

import java.util.ArrayList;
import externalExample.ProgramInfo;
import java.util.Scanner;

public class AddressBookEx {
	public static void main(String[] args) {
		ProgramInfo.print("주소록 프로그램", "차재건", 1.0);
		ArrayList<Address> addressBook = new ArrayList<Address>();
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.print("1: 등록 2: 전체조회 3: 건별조회 4: 삭제 x: 종료 ==> ");
			String code = scan.next();
			switch(code) {
				case "1": input(scan, addressBook); break;
				case "2": searchAll(); break;
				case "3": searchName(); break;
				case "4": delete(); break;
				case "x": break;
				default: System.out.println("입력 구분을 잘못 입력하셨습니다!!");
			}
			if (code.equals("x")) {
				System.out.println("**** 프로그램을 이용해 주셔서 감사합니다. ****");
				ProgramInfo.print("\n주소록 프로그램", "차재건", 1.0);
				break;
			}
		}
	}

	private static void delete() {
		System.out.println("*** 주소 삭제 처리 ***");
	}

	private static void searchName() {
		System.out.println("*** 이름으로 주소 조회 ***");
	}

	private static void searchAll() {
		System.out.println("*** 전체 주소 조회 ***");
	}

	private static void input(Scanner scan, ArrayList<Address> addressBook) {
		System.out.println("*** 주소 등록 처리 ***");
		System.out.print("이름 입력: ");
		String name = scan.next();
		System.out.print("전화번호 입력: ");
		String phone = scan.next();
		addressBook.add(new Address(name, phone));
		int size = addressBook.size() - 1;
		String a_name = addressBook.get(size).getName();
		String a_phone = addressBook.get(size).getPhone();
		System.out.println("등록 완료 ==> " + a_name + " " + a_phone);
	}
}
