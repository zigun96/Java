package FileEX;

import java.io.File;

public class FileEx1 {
	public static void main(String[] args) throws Exception {
		// c:/filetest ���� Ȯ��, �Ű������� ��θ� �־���
		File tempDir = new File("c:/filetest");
		// ������ ���� �����, ��ü�� �޼��� �̿�
		if (!tempDir.exists()) tempDir.mkdir();
		System.out.println(tempDir.exists());
		File newFile = new File("c:/filetest/newTest.txt");
		// ������ ���� �����, ��ü�� �޼��� �̿�
		if (!newFile.exists()) newFile.createNewFile();
		System.out.println(newFile.exists());
	}
}
