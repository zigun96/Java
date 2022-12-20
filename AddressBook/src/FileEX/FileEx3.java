package FileEX;

import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.File;

public class FileEx3 {
	public static void main(String[] args) throws Exception{
		File outfile = new File("c:/filetest/newtest.txt");
		OutputStream os1 = new FileOutputStream(outfile);
		os1.write('J');
		os1.write('A');
		os1.write('V');
		os1.write('A');
		os1.flush();
		os1.close();
	}
}
