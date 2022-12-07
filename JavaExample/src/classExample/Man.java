package classExample;



public class Man {
	public Man() {}
	public Man(int age) {
		this.age = age;
	}
	public Man(int age , String name) {
		this.age = age;
		this.name = name;
	}
	
	int age;
	String name;
	boolean married;
	int child;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAge(int age, String name, boolean married, int child) {
		this.age = age;
		this.name = name;
		this.married = married;
		this.child = child;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}
	public int getChild() {
		return child;
	}
	public void setChild(int child) {
		this.child = child;
	}
	
}
