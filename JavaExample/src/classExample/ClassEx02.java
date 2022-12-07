package classExample;

public class ClassEx02 {
	public static void main(String[] args) {
		ClassInfo ci = new ClassInfo();
		Name name = new Name();
		
		name.namePrint();
		ci.namePrint();
		
		ci.ver = 2.0;
		name.name = "Â÷Àç°Ç";
		
		name.namePrint();
		ci.namePrint();
	}
}
