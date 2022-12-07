package arrayExample;

import java.util.Scanner;

public class ArrayMulti {
	public static void main(String[] args) {
		// 키보드 입력 객체 생성
		Scanner scan = new Scanner(System.in);
		// 변수, 배열 선언
		String[][] addr = new String[5][2];
		// 5명의 이름과 ID를 차례로 받기 위한 5회 반복문 처리
		for(int i = 0; i < addr.length; i++) {
			// 이름 입력 안내 문구 출력
			System.out.printf("%d번째 학생 이름 입력: ",i + 1);
			// 이름 입력 처리
			addr[i][0] = scan.nextLine();
			// 점수 입력 안내 문구 출력
			System.out.print("ID 입력: ");
			// 점수 입력 처리
			addr[i][1] = scan.nextLine();
		}
		scan.close();
		System.out.println("입력이 완료되었습니다!!");
		// 입력 완료 후 배열 내용 출력하기 - 반복문
		for(int i = 0; i < addr.length; i++) {
			System.out.printf("%d번째 학생: %-5s %s\n", i + 1, addr[i][0], addr[i][1]);
		}
		System.out.print("+++ 프로그램을 종료합니다!! +++");
	}
}
