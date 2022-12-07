package select;
// Scanner 클래스 사용하기 위해 임포트
import java.util.Scanner;

public class Elevator {
	public static void main(String[] args) {
		// 스캐너 객체 생성
		Scanner scan = new Scanner(System.in);
		// 필요 변수 선언
		int floor;
		String info="";
		// 입력 처리
		System.out.print("층수 입력(1 ~ 5): ");
		floor = scan.nextInt();
		scan.close();
		// switch-case 문으로 구현
		switch (floor) {
		case 1:
				info = "약국";
				break;
		case 2:
				info = "정형외과";
				break;
		case 3:
				info = "피부과";
				break;
		case 4:
				info = "치과";
				break;
		case 5:
				info = "헬스클럽";
				break;
		default:
				info = "착오입력";
		}
		// if~else if~else 문으로 구현
//		if(floor == 1) info = "약국";
//		else if(floor == 2) info = "정형외과";
//		else if(floor == 3) info = "피부과";
//		else if(floor == 4) info = "치과";
//		else if(floor == 5) info = "헬스클럽";
//		else info = "착오입력";
		// 종료 메세지 출력
		System.out.println(floor+"층: "+info+"입니다.");
		System.out.println("*** 프로그램을 종료합니다. ***");
	}
}
