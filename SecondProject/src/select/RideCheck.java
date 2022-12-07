package select;
//Scanner 클래스 사용하기 위해 임포트
import java.util.Scanner;

public class RideCheck {
	public static void main(String[] args) {
		// 클래스 정보 출력
		System.out.println("++++++++++++++++++++++++++");
		System.out.println("+  놀이기구 탑승 제한 프로그램	 +");
		System.out.println("+   	개발자: 차재건		 +");
		System.out.println("+  		 버 전: 1.0	  	 +");
		System.out.println("++++++++++++++++++++++++++");
		// scanner 객체 생성
		Scanner scan = new Scanner(System.in);
		// 필요 변수 선언
		double height, weight;
		// 입력 처리
		System.out.print("키 입력(cm): ");
		height = scan.nextDouble();
		System.out.print("몸무게 입력(kg): ");
		weight = scan.nextDouble();
		// 스캐너 닫기
		scan.close();
		// 판단 및 출력
		if (height <= 190 && weight < 120) {
			System.out.println("어서오세요, 즐거운 시간되세요.");
		}else {
			System.out.println("키가 190cm가 넘어 이 놀이기구를 탑승할 수 없습니다.");
			System.out.println("몸무게가 120kg이 넘어 이 놀이기구를 탑승할 수 없습니다.");
		}
		// 종료 문구 출력
		System.out.println("프로그램을 종료합니다.");
	}
}
