package ThreadEx;
// '����, ����, ��' ��� �� 2���� �ݺ��ϴ� ���α׷�
public class RockScissorPapers {
	public static void main(String[] args) {
		// ���� Thread
		Thread scissor = new Thread(new Runnable() {
			public void run() {
				try {
					Thread.sleep(0);
				} catch (InterruptedException e) {}
				for (int i = 0; i < 5; i++) {
					System.out.println("����");
					try {
						Thread.sleep(2500);
					} catch (InterruptedException e){}
				}
			}		
		});
		// ���� Thread
		Thread rock = new Thread(new Runnable() {
			public void run() {
				try {
					Thread.sleep(250);
				} catch (InterruptedException e) {}
				for (int i = 0; i < 5; i++) {
					System.out.println("����");
					try {
						Thread.sleep(2500);
					} catch (InterruptedException e){}
				}
			}		
		});
		// �� Thread
		Thread paper = new Thread(new Runnable() {
			public void run() {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {}
				for (int i = 0; i < 5; i++) {
					System.out.println("��");
					try {
						Thread.sleep(2500);
					} catch (InterruptedException e){}
				}
			}		
		});
		rock.start();
		scissor.start();
		paper.start();
	}
}
