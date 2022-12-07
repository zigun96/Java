package classExample;

import java.util.Arrays;

public class ArrayMethod {
	public static void main(String[] args) {
		int[] a = new int[] {1, 2, 3};
		printArray(a);
		// 대입 없이 선언한 배열을 바로 매개변수로 넣어줌
		printArray(new int[] {4, 5, 6});
		// printArray({7, 8, 9});
	}
	public static void printArray(int [] b) {
		System.out.println(Arrays.toString(b));
		// 매개변수로 받은 배열의 주소값 출력
		System.out.println(b);
	}
}
