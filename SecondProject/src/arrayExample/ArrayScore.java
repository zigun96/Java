package arrayExample;

import java.util.Scanner;

public class ArrayScore {
	public static void main(String[] args) {
		// 키보드 입력 객체 생성
		Scanner scan = new Scanner(System.in);
		// 변수, 배열 선언
		int[] jumsu = new int[5];
		int sum = 0;
		double avg = 0;
		// 5명의 점수를 차례로 받기 위한 5회 반복문 처리
		for(int i = 0; i < 5; i++) {
			// 입력 안내 문구 출력
			System.out.printf("%d번째 학생 점수 입력: ",i + 1);
			// 입력 처리
			jumsu[i] = scan.nextInt();
		}
		scan.close();
		System.out.println("점수 입력이 완료되었습니다!!");
		// 입력 완료 후 배열 내용 출력하기 - 반복문
		for(int i = 0; i < 5; i++) {
			sum += jumsu[i];
			System.out.printf("%d번째 학생 점수: %d\n",i + 1, jumsu[i]);
		}
		avg = (double)sum / jumsu.length ;
		System.out.printf("총점: %d\n",sum);
		System.out.printf("평균: %.1f\n",avg);
		System.out.print("+++ 프로그램을 종료합니다!! +++");
	}
}
