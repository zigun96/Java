package FileEX;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import arrayLIstEx.Address;

public class FileEx4 {
	public static void main(String[] args) throws Exception{
		// ���Ͽ��� �о ������ ����
		ArrayList<Address> read_data = null; 
		FileInputStream fis = new FileInputStream("c:/filetest/newdata1.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		// ���Ͽ��� ArrayList �б�, ĳ������ ���ذ�
		read_data = (ArrayList<Address>) ois.readObject();
		ois.close();
		System.out.println(read_data. getClass());
		System.out.println("ArrayList ��ü ������ ����� ������ �о����ϴ�.");
	}
}
