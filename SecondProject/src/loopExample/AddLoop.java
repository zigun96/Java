package loopExample;

import java.util.Scanner;

public class AddLoop {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int num = 1, evenSum = 0, oddSum = 0, mSum = 0;
		while(true){
			evenSum = 0; oddSum = 0; mSum = 0;
			System.out.print("얼마까지 더할지 정수를 입력하세요(종료 시 0): ");
			num = scan.nextInt();
			if (num == 0) break;
			for (int i = 0; i <= num; i++) {
				if(i % 2 == 0) {
					evenSum += i;
				}else {
					oddSum += i;	
				}
				if(i % 3 == 0) {
					mSum += i;
				}
			}
			System.out.printf("1부터 %d까지 짝수의 합은 %d입니다.\n", num, evenSum);
			System.out.printf("1부터 %d까지 홀수의 합은 %d입니다.\n", num, oddSum);
			System.out.printf("1부터 %d까지 3의 배수의 합은 %d입니다.\n", num, mSum);
		}scan.close();
		System.out.print("*** 프로그램을 종료합니다. ***");
	}
}
