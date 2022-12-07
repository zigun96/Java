package select;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		// 변수 선언, 객체 생성
		int num1 = 0, num2 = 0;
		double result = 0;
		char operator;
		Scanner scan = new Scanner(System.in);
		while(true) {
			// 입력
			System.out.print("연산자 입력 (+, -, *, /), 종료 키워드 'x': ");
			operator = scan.next().charAt(0);
			if( operator == 'x') break;
			try {
				// 입력
				System.out.print("첫 번째 숫자(정수) 입력: ");
				num1 = scan.nextInt();
				System.out.print("두 번째 숫자(정수) 입력: ");
				num2 = scan.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.println(e);
				System.out.println("연산될 숫자는 정수만 입력해주세요!!");
//				break;
				System.exit(0);
			}
			// switch-case문으로 구현
			switch(operator) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = (double)num1 / num2;
				break;
			default:
				System.out.print("연산자 [+, -, *, /] 혹은 종료 키워드 'x'만 입력해주세요.\n");	
				continue;
			}
			// 결과 메세지 출력
			System.out.printf("%d %c %d = %.2f\n",num1, operator, num2, result);
		}
		// 스캐너 닫기
		scan.close();
		// 종료 메세지 출력
		System.out.println("프로그램을 종료합니다.");
	}
}
