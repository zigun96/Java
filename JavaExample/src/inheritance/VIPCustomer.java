package inheritance;

public class VIPCustomer extends Customer{
	private int agentID;
	double saleRatio;
	public VIPCustomer() {
		setCustomerGrade("VIP"); 
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer() ������ ȣ�� ");
	}
//	public int calcPrice(int price) {
//		bonusPoint += price * bonusRatio;
//		return price - (int)(price * saleRatio);
//	}
}
