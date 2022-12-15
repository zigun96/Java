package exceptionEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInput {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("c:\\text1.txt");
		} catch (FileNotFoundException e){
//			 e.printStackTrace();
			System.out.println("������ ������ �����ϴ�!");
//			return;
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("���ҽ��� �����߽��ϴ�!");
			}
		}
		System.out.println("������ ������ �ֽ��ϴ�!");
	}
}
