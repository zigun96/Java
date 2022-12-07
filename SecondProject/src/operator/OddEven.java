package operator;
// Scanner 클래스 사용하기 위해 임포트
import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		// 클래스 정보 출력
		System.out.println("++++++++++++++++++++++++++");
		System.out.println("+ 홀짝 선별 프로그램	 +");
		System.out.println("+   개발자: 차재건	 +");
		System.out.println("+   버 전: 1.0  	 +");
		System.out.println("++++++++++++++++++++++++++");
		// scanner 객체 생성
		Scanner scan = new Scanner(System.in);
		// 필요 변수 선언
		String inputNum;
		int num;
		String outputMessage;	
		// 입력 처리
		System.out.print("정수 입력: ");
		inputNum = scan.nextLine();
		// 스캐너 닫기
		scan.close();
		// 형 변환
		num = Integer.parseInt(inputNum);
		// 홀짝 판단
		//outputMessage = num % 2 == 0? "짝수입니다." : "홀수입니다.";
		if ( num % 2 == 0) outputMessage = "짝수입니다.";
		else outputMessage = "홀수입니다.";
		// 결과 출력
		System.out.println(outputMessage);
		// 종료 안내 메세지
		System.out.println("프로그램을 이용해 주셔서 감사합니다.");
	}
}
