package classExample;

public class ManEx {
	public static void main(String[] args) {
		Man man1 = new Man();
		System.out.println("�̸�: " + man1.getName());
		System.out.println("����: " + man1.getAge());
		System.out.println("��ȥ����: " + man1.isMarried());
		System.out.println("�ڳ��: " + man1.getChild());
		System.out.println("==========================");
		Man man2 = new Man(60);
		System.out.println("�̸�: " + man2.getName());
		System.out.println("����: " + man2.getAge());
		System.out.println("��ȥ����: " + man2.isMarried());
		System.out.println("�ڳ��: " + man2.getChild());
		System.out.println("==========================");
		Man man3 = new Man(50,"ȫ�浿");
		System.out.println("�̸�: " + man3.getName());
		System.out.println("����: " + man3.getAge());
		System.out.println("��ȥ����: " + man3.isMarried());
		System.out.println("�ڳ��: " + man3.getChild());
		System.out.println("==========================");

		Man man = new Man();
		man.setAge(40);
		man.setChild(3);
		man.setMarried(true);
		man.setName("���ӽ�");
		System.out.println("�̸�: " + man.getName());
		System.out.println("����: " + man.getAge());
		System.out.println("��ȥ����: " + man.isMarried());
		System.out.println("�ڳ��: " + man.getChild());
		System.out.println("==========================");
		man.setAge(27,"�����",false,0);
		System.out.println("�̸�: " + man.getName());
		System.out.println("����: " + man.getAge());
		System.out.println("��ȥ����: " + man.isMarried());
		System.out.println("�ڳ��: " + man.getChild());
		System.out.println("==========================");
	}
}
