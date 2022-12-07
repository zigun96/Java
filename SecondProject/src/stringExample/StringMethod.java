package stringExample;

import java.util.Scanner;

public class StringMethod {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String indata;
		while(true) {
			System.out.print("주민등록번호(13자리) 입력(종료 시x): ");
			indata = scan.next();
			if (indata.equals("x")) {
				break;
			}
			if (indata.length() != 13) {
				System.out.println("입력 착오 : 주민등록번호는 13자리입니다!!");
			} else {
				int month = Integer.parseInt(indata.substring(2, 4));
				if (month < 1 || month > 12) {
					System.out.println("월 입력착오: 생년월일은 1 ~ 12월 사이입니다!!");
				} else {
					System.out.println("입력한 주민등록번호 : " + indata.substring(0, 6) + "-" + indata.substring(6, 13));
					int gender = Integer.parseInt(indata.substring(6,7));
					if (gender % 2 == 0) {
						System.out.println("여성입니다!!");
					} else {
						System.out.println("남성입니다!!");
					}
				}		
			}
			scan.nextLine();
		}
		scan.close();
		System.out.println("프로그램을 종료합니다!!");
	}
}
