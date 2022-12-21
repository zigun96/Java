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
		// 파일에 ArrayList 저장
		oos.writeObject(addressBook);
		oos.close();
		System.out.println(addressBook. getClass());
		System.out.println("ArrayList 객체 구조가 저장된 파일을 만들었습니다.");
	}
}
