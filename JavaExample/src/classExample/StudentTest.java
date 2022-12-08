package classExample;

public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student();
//		studentLee.studentName = "ȫ�浿";
//		System.out.println(studentLee.studentName);
		studentLee.setStudentName("ȫ�浿");
		System.out.println(studentLee.getStudentName());
	}
}
