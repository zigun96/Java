package classExample;

import java.util.Arrays;

public class ArrayMethod {
	public static void main(String[] args) {
		int[] a = new int[] {1, 2, 3};
		printArray(a);
		// ���� ���� ������ �迭�� �ٷ� �Ű������� �־���
		printArray(new int[] {4, 5, 6});
		// printArray({7, 8, 9});
	}
	public static void printArray(int [] b) {
		System.out.println(Arrays.toString(b));
		// �Ű������� ���� �迭�� �ּҰ� ���
		System.out.println(b);
	}
}
