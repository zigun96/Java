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
			System.out.println("선택한 파일이 없습니다!");
//			return;
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println("리소스를 해제했습니다!");
			}
		}
		System.out.println("선택한 파일이 있습니다!");
	}
}
