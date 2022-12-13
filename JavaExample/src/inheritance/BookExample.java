package inheritance;

import externalExample.ProgramInfo;

public class BookExample {
	public static void main(String[] args) {
		ProgramInfo.print("Super() 실습", "차재건", 1.0);
		EnglishBook eb = new EnglishBook("성문종합영어", 25000);
		eb.printPrice();
	}
}