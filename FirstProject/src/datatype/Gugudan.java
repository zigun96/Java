package datatype;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		System.out.println("++++++++++++++++++++++++++");
		System.out.println("+    구구단 출력 프로그램     +");
		System.out.println("+   	개발자: 차재건		 +");
		System.out.println("+  		 버 전: 1.0	  	 +");
		System.out.println("++++++++++++++++++++++++++");
		Scanner scanner = new Scanner(System.in);
		int dan = 2;
		System.out.print("출력할 구구단의 단을 입력해주세요: ");
		try {
			dan = scanner.nextInt();
		}
		catch (InputMismatchException e) {
//			System.out.println(e);
			System.out.println("입력 오류... 정수만 입력하세요!!");
		}finally {
			scanner.close();	
		}
//		for (int i = 2; i <= dan; i++) {
		if(dan >= 2 && dan < 10) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %2d\n", dan, j, dan * j);
			}
		}else {
			System.out.print("구구단 2단 ~ 9단까지만 이용하세요!");
		}
//		System.out.print("======================\n");
//		}
	}
}
