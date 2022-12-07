package classExample;

import externalExample.ProgramInfo;

public class ImportEx {
	public static void main(String[] args) {
//		externalExample.ProgramInfo pi = new externalExample.ProgramInfo("외부클래스 실습", "차재건");
		ProgramInfo pi = new ProgramInfo("외부클래스 실습", "차재건","1.0");
		pi.print();
	}
}

 
