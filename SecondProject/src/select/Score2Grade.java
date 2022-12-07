package select;
// 패키지, 클래스 불러오기
import java.util.Scanner;

public class Score2Grade {
	public static void main(String[] args) {
		// 클래스 정보 출력
		System.out.println("++++++++++++++++++++++++++");
		System.out.println("+     학점 출력 프로그램	     +");
		System.out.println("+   	개발자: 차재건		 +");
		System.out.println("+  		 버 전: 1.0	  	 +");
		System.out.println("++++++++++++++++++++++++++");
		
		// 변수 선언 및 객체 생성
		Scanner scan = new Scanner(System.in);
		int score = 0;
		String grade = "";
		// 입력
		System.out.print("점수 입력: ");
		score = scan.nextInt();
		scan.close();
		// switch-case 문으로 구현
		switch (score / 5) {
		case 20:
		case 19:
			grade = "A+";
			break;
		case 18:
			grade = "A";
			break;
		case 17:
			grade = "B+";
			break;
		case 16:
			grade = "B";
			break;
		case 15:
			grade = "C+";
			break;
		case 14:
			grade = "C";
			break;
		case 13:
			grade = "D+";
			break;
		case 12:
			grade = "D";
			break;
		default:
			grade = "F";
		}
		// 조건에 따른 출력자료 대입 - 단순 if문 5개
//		if(score >= 90)grade = 'A';
//		else if(score >= 80)grade = 'B';
//		else if(score >= 70)grade = 'C';
//		else if(score >= 60)grade = 'D';
//		else grade = 'F';
		// 출력 처리
		System.out.println(score+"점은 "+grade+"입니다.");
	}
}
