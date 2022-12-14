package arrayLIstEx;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import externalExample.ProgramInfo;
import java.util.Scanner;

public class AddressBookEx {
	public static void main(String[] args) throws Exception {
		ProgramInfo.print("주소록 프로그램", "차재건", 1.0);
		ArrayList<Address> addressBook = new ArrayList<Address>();
		addressBook = readfile();
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.print("1: 등록 2: 전체조회 3: 건별조회 4: 삭제 x: 종료 ==> ");
			String code = scan.next();
			switch(code) {
				case "1": input(scan, addressBook); break;
				case "2": searchAll(addressBook); break;
				case "3": searchName(scan, addressBook); break;
				case "4": delete(scan, addressBook); break;
				case "x": break;
				default: System.out.println("입력 구분을 잘못 입력하셨습니다!!");
			}
			if (code.equals("x")) {
				writefile(addressBook);
				System.out.println("**** 프로그램을 이용해 주셔서 감사합니다. ****");
				break;
			}
		}
	}

	private static ArrayList<Address> readfile() throws Exception{
		ObjectInputStream ois = new ObjectInputStream(
				
				new FileInputStream("c://filetest/newdata2.txt"));
		// 파일에서 읽어서 저장할 변수
		ArrayList<Address> read_data = null;
		// 파일에서 ArrayList 읽기
		read_data = (ArrayList<Address>)ois.readObject();
		ois.close();
		return read_data;
	}
	
	private static void writefile(ArrayList<Address> addressBook) throws Exception{
		ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("c://filetest/newdata2.txt"));
		// 파일에 ArrayList 저장
		oos.writeObject(addressBook);
		oos.close();
	}

	private static void delete(Scanner scan, ArrayList <Address> addressBook) {
		System.out.println("*** 주소 삭제 처리 ***");
		if(addressBook.size() <= 0) {
			System.out.println("등록된 연락처가 없습니다.");
		} else {
			System.out.println("이름 입력: ");
			String name = scan.next();
			int cnt = 0;
			System.out.println("** 등록 번호, 이메일 내역 **");
			for (int i = 0; i < addressBook.size(); i++) {
				if (name.equals(addressBook.get(i).getName())) {
					cnt ++;
					System.out.println(i +") " + ": " + addressBook.get(i).getPhone() + " " + addressBook.get(i).getEmail());
				}
			}
			if(cnt == 0) System.out.println("**** 등록된 연락처가 없습니다. ****");
			else {
				System.out.print("삭제할 목록번호 #) 입력: ");
				String num = scan.next();
				System.out.println("정말 삭제하시겠습니까? (y/n)");
				String check = scan.next();
				if (check.equals("y")) {
					// ArrayList -> key로(첫 번째 거)도, 주소로도 지우게 할 수 있다.
					addressBook.remove(Integer.parseInt(num));
					System.out.println("삭제되었습니다.");
				} else System.out.println("취소 되었습니다...");
			}
		}
	}

	private static void searchName(Scanner scan, ArrayList<Address> addressBook) {
		System.out.println("*** 이름으로 주소 조회 ***");
		if(addressBook.size() <= 0) {
			System.out.println("등록된 연락처가 없습니다.");
		} else {
			System.out.print("이름 입력: ");
			String name = scan.next();
			int cnt = 0;
			for (int i = 0; i < addressBook.size(); i++) {
				if (name.equals(addressBook.get(i).getName())) {
					System.out.println(name + " : " + addressBook.get(i).getPhone() + " " + addressBook.get(i).getEmail());
					cnt ++;
				}
			}
			if (cnt == 0) System.out.println("등록된 연락처가 없습니다.");
		}
	}

	private static void searchAll(ArrayList<Address> addressBook) {
		System.out.println("*** 전체 주소 조회 ***");
		if(addressBook.size() <= 0) {
			System.out.println("등록된 연락처가 없습니다.");
		}
		for (int i = 0; i < addressBook.size(); i++) {
			String a_name = addressBook.get(i).getName();
			String a_phone = addressBook.get(i).getPhone();
			String a_email = addressBook.get(i).getEmail();
			System.out.println((i+1) + ") " + a_name + " " + a_phone + " " + a_email);
		}
	}

	private static void input(Scanner scan, ArrayList<Address> addressBook) {
		System.out.println("*** 주소 등록 처리 ***");
		System.out.print("이름 입력: ");
		String name = scan.next();
		System.out.print("전화번호 입력: ");
		String phone = scan.next();
		System.out.print("이메일 입력: ");
		String email = scan.next();
		addressBook.add(new Address(name, phone, email));
		int size = addressBook.size() - 1;
		String a_name = addressBook.get(size).getName();
		String a_phone = addressBook.get(size).getPhone();
		String a_email = addressBook.get(size).getEmail();
		System.out.println("등록 완료 ==> " + a_name + " " + a_phone + " " + a_email);
	}
}
