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
		System.out.println("\t���α׷� ��:"+programName);
		System.out.println("\t������ �̸�:"+developerName);
		System.out.println("\t���� ����:"+version);
		System.out.println("*".repeat(36));
	}
}
