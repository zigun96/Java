package FileEX;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import arrayLIstEx.Address;

public class FileEx5 {
	public static void main(String[] args) throws Exception{
		ArrayList addressBook = new ArrayList<Address>();
		FileOutputStream fos = new FileOutputStream("c://filetest/newdata2.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		// ���Ͽ� ArrayList ����
		oos.writeObject(addressBook);
		oos.close();
		System.out.println(addressBook. getClass());
		System.out.println("ArrayList ��ü ������ ����� ������ ��������ϴ�.");
	}
}
