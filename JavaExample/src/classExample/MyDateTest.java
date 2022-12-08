package classExample;

public class MyDateTest {
	public static void main(String[] args) {
		MyDate date = new MyDate();
		date.setMonth(2);
		date.setDay(18);
		date.setYear(2022);
		System.out.printf("%d년 %d월 %d일 입니다.\n", date.getYear(), date.getMonth(), date.getDay());
	}
}