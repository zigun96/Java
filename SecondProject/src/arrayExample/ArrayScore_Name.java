package arrayExample;

import java.util.Scanner;

public class ArrayScore_Name {
	public static void main(String[] args) {
		// 키보드 입력 객체 생성
		Scanner scan = new Scanner(System.in);
		// 변수, 배열 선언
		int[] jumsu = new int[5];
		String[] name = new String[5];
		int sum = 0;
		double avg = 0;
		// 5명의 이름과 점수를 차례로 받기 위한 5회 반복문 처리
		for(int i = 0; i < 5; i++) {
			// scan.nextInt()에 남겨진 개행문자 처리를 위한 문장
			scan.nextLine();
			// 이름 입력 안내 문구 출력
			System.out.printf("%d번째 학생 이름 입력: ",i + 1);
			// 이름 입력 처리
			name[i] = scan.nextLine();
			// 점수 입력 안내 문구 출력
			System.out.print("점수 입력: ");
			// 점수 입력 처리
			jumsu[i] = scan.nextInt();
		}
		scan.close();
		System.out.println("입력이 완료되었습니다!!");
		// 입력 완료 후 배열 내용 출력하기 - 반복문
		System.out.println("++++ 학생 별 점수 ++++");
		for(int i = 0; i < 5; i++) {
			sum += jumsu[i];
			System.out.printf("%s		: %d\n",name[i], jumsu[i]);
		}
		avg = (double)sum / jumsu.length ;
		System.out.printf("총점: %d\n",sum);
		System.out.printf("평균: %.1f\n",avg);
		System.out.print("+++ 프로그램을 종료합니다!! +++");
	}
}
