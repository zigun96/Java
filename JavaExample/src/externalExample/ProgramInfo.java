package externalExample;

public class ProgramInfo {
	String programName;
	String developerName;
	String version;
	
	public ProgramInfo(String programName, String developerName, String version) {
		this.programName = programName;
		this.developerName = developerName;
		this.version = version;
	}
	public void print() {
		System.out.println("*".repeat(36));
		System.out.println("\t프로그램 명:"+programName);
		System.out.println("\t개발자 이름:"+developerName);
		System.out.println("\t개발 버전:"+version);
		System.out.println("*".repeat(36));
	}
}
