package inheritance;

public class Book {
	String title = " ";
	int price = 0;
	int code = 1000;
	public Book() {
		System.out.println("++ Book �⺻ ������ ++\n");
	}
	public Book(String title, int price) {
		this();
		this.title = title;
		this.price = price;
	}
	public void printPrice() {
		System.out.println(title+"�� ������ "+price+"�� �Դϴ�.");
	}
}