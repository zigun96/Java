package classExample;

public class MyDateTest {
	public static void main(String[] args) {
		MyDate date = new MyDate();
		date.setMonth(2);
		date.setDay(18);
		date.setYear(2022);
		System.out.printf("%d�� %d�� %d�� �Դϴ�.\n", date.getYear(), date.getMonth(), date.getDay());
	}
}