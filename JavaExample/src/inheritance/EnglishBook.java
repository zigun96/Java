package inheritance;

public class EnglishBook extends Book {
	int code = 2000;
	public EnglishBook(String title, int price) {
		super(title, price);
	}
	public void printPrice() {
		super.printPrice();
		System.out.println("");
		System.out.println("code	:" + code);
		System.out.println("this.code	:" + this.code);
		System.out.println("super.code	:" + super.code);
		System.out.println("");
		System.out.println("price	:" + price);
		System.out.println("this.price	:" + this.price);
		System.out.println("super.price	:" + super.price);
		
	}
}