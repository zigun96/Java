package loopExample;

import java.util.Scanner;

public class BasicLoop {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int num =1, sum = 0;
		System.out.print("얼마까지 더할지 정수를 입력하세요(종료 시 0): ");
		num = scan.nextInt();
		scan.close();
		// num 부터 1까지의 합
//		for (int i = num; i >= 1; i--) {
//				sum += i;
//		}
		// 1 부터 num까지 짝수의 합
//		for (int i = 0; i <= num; i+=2) {
//				sum += i;
//		}
		// 1 부터 num까지의 합
//		for (int i = 0; i <= num; i++) {
//				sum += i;
//		}
		// 1 부터 num까지 짝수의 합
		for (int i = 0; i <= num; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}

		System.out.printf("1부터 %d까지 짝수의 합은 %d입니다.\n", num, sum);
	}
}
