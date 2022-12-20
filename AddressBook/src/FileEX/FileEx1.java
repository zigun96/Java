package FileEX;

import java.io.File;

public class FileEx1 {
	public static void main(String[] args) throws Exception {
		// c:/filetest 폴더 확인, 매개변수로 경로를 넣어줌
		File tempDir = new File("c:/filetest");
		// 없으면 폴더 만들기, 객체의 메서드 이용
		if (!tempDir.exists()) tempDir.mkdir();
		System.out.println(tempDir.exists());
		File newFile = new File("c:/filetest/newTest.txt");
		// 없으면 파일 만들기, 객체의 메서드 이용
		if (!newFile.exists()) newFile.createNewFile();
		System.out.println(newFile.exists());
	}
}
