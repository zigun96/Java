package classExample;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if (month == 2) {
			if(day < 1 || day > 29) {
				System.out.println("���� �����Դϴ�!");
				System.out.close();
			} else this.day = day;
		} else {
			this.day = day;
		}
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month < 1 || month > 12) {
			System.out.println("�� �����Դϴ�!");
			System.out.close();
		} else {
			this.month = month;
		}
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}
