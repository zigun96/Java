package operator;

import java.util.Scanner;

public class InputOperation {
	public static void main(String[] args) {
		// 클래스 정보 출력
		System.out.println("++++++++++++++++++++++++++");
		System.out.println("+ 점수 계산 프로그램	 +");
		System.out.println("+   개발자: 차재건	 +");
		System.out.println("+   버 전: 1.0  	 +");
		System.out.println("++++++++++++++++++++++++++");
		// scanner 객체 생성
		Scanner scan = new Scanner(System.in);
		// 필요 변수 선언
		double korScore, engScore, mathScore, scScore, totalScore;
		double avgScore;
		String honorMessage;
		// 입력 처리
		System.out.print("국어 점수 입력: ");
		korScore = scan.nextDouble();
		System.out.print("영어 점수 입력: ");
		engScore = scan.nextDouble();
		System.out.print("수학 점수 입력: ");
		mathScore = scan.nextDouble();
		System.out.print("과학 점수 입력: ");
		scScore = scan.nextDouble();
		scan.close();
		// 계산
		totalScore = korScore + engScore + mathScore + scScore;
		avgScore = totalScore / 4;
		honorMessage = avgScore >= 90 ? "우등생입니다." : "수고했어요!";
		// 출력
		System.out.println("총점: "+totalScore);
		System.out.printf("평균: %.1f",avgScore);
		System.out.println();
		System.out.println(honorMessage);
		
		// 종료 문구 출력
		System.out.println("프로그램을 이용해 주셔서 감사합니다!");
	}
}
