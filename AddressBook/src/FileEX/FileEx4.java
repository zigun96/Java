package FileEX;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import arrayLIstEx.Address;

public class FileEx4 {
	public static void main(String[] args) throws Exception{
		// 파일에서 읽어서 저장할 변수
		ArrayList<Address> read_data = null; 
		FileInputStream fis = new FileInputStream("c:/filetest/newdata1.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		// 파일에서 ArrayList 읽기, 캐스팅을 해준것
		read_data = (ArrayList<Address>) ois.readObject();
		ois.close();
		System.out.println(read_data. getClass());
		System.out.println("ArrayList 객체 구조가 저장된 파일을 읽었습니다.");
	}
}
