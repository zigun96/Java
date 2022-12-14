package innerClassEx;

abstract class Action {
	public abstract void exec();
}

// �͸� �̳� Ŭ����ȭ
//class MyAction extends Action {
//	@Override
//	public void exec() {
//		System.out.println("����");
//	}
//}

public class ActionEx {
	public static void main(String[] args) {
		Action action = new Action() {
			public void exec() {
				System.out.println("����");
			}
		};
		action.exec();
	}
}
