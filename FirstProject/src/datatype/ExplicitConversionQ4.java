package datatype;

public class ExplicitConversionQ4 {
	public static void main(String[] args) {
		int iNum = 10;
		double dNum = 2.0;
		
		System.out.println(iNum + " + " + dNum + " = " + (iNum + (int)dNum));
		System.out.println(iNum + " - " + dNum + " = " + (iNum - (int)dNum));
		System.out.println(iNum + " * " + dNum + " = " + (iNum * (int)dNum));
		System.out.println(iNum + " / " + dNum + " = " + (iNum / (int)dNum));
	}
}
