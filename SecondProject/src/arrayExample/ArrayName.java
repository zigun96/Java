package arrayExample;

import java.util.Scanner;

public class ArrayName {
	public static void main(String[] args) {
		// 키보드 입력 객체 생성
		Scanner scan = new Scanner(System.in);
		// 변수, 배열 선언
		String[] name = new String[5];
		// 5명의 이름을 차례로 받기 위한 5회 반복문 처리
		for(int i = 0; i < 5; i++) {
			// 입력 안내 문구 출력
			System.out.printf("%d번째 학생 이름 입력: ",i + 1);
			// 입력 처리
			name[i] = scan.nextLine();
		}
		scan.close();
		System.out.println("이름 입력이 완료되었습니다!!");
		// 입력 완료 후 배열 내용 출력하기 - 반복문
		for(int i = 0; i < 5; i++) {
			System.out.printf("%d번째 학생 이름: %s\n",i + 1, name[i]);
		}
		System.out.print("+++ 프로그램을 종료합니다!! +++");
	}
}
