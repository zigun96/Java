package arrayExample;

public class ArrayTest2 {
	public static void main(String[] args) {
		double[] data = new double[5];
		
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		
		System.out.printf("data�迭 ����: %d\n",data.length);
		for(int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}
}
