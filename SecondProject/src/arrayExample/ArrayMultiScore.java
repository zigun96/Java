package arrayExample;

import java.util.Scanner;

public class ArrayMultiScore {
	public static void main(String[] args) {
		// 키보드 입력 객체 생성
		Scanner scan = new Scanner(System.in);
		// 변수, 배열 선언
		int[][] jumsu = new int[3][2];
		String[] name = new String[3];
		int []sum = new int[2];
		double []avg = new double[2];
		// 5명의 이름과 점수를 차례로 받기 위한 5회 반복문 처리
		for(int i = 0; i < name.length; i++) {
			// scan.nextInt()에 남겨진 개행문자 처리를 위한 문장
			scan.nextLine();
			// 이름 입력 안내 문구 출력
			System.out.printf("%d번째 학생 이름 입력: ",i + 1);
			// 이름 입력 처리
			name[i] = scan.nextLine();
			// 영어 점수 입력 안내 문구 출력
			System.out.print("영어 점수 입력: ");
			// 영어 점수 입력 처리
			jumsu[i][0] = scan.nextInt();
			// 자바 점수 입력 안내 문구 출력
			System.out.print("자바 점수 입력: ");
			// 자바 점수 입력 처리
			jumsu[i][1] = scan.nextInt();
			
		}
		scan.close();
		System.out.println("입력이 완료되었습니다!!");
		// 배열 내용출력 및 총점 계산
		System.out.println("++++ 학생 별 점수 ++++");
		System.out.println("\t 영어 자바");
		for(int i = 0; i < name.length; i++) {
			sum[0] += jumsu[i][0]; sum[1] += jumsu[i][1];
			System.out.printf("%s\t: %d %d\n",name[i], jumsu[i][0], jumsu[i][1]);
		}
		// 평균 계산
		avg[0] = (double)sum[0] / jumsu.length ;
		avg[1] = (double)sum[1] / jumsu.length;
		// 총점, 평균, 종료 안내 문구 출력
		System.out.printf("총점\t: %d %d\n", sum[0], sum[1]);
		System.out.printf("평균\t: %.1f %.1f\n", avg[0], avg[1]);
		System.out.print("+++ 프로그램을 종료합니다!! +++");
	}
}
