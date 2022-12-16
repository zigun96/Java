package ThreadEx;
// '가위, 바위, 보' 출력 후 2초후 반복하는 프로그램
public class RockScissorPapers {
	public static void main(String[] args) {
		// 가위 Thread
		Thread scissor = new Thread(new Runnable() {
			public void run() {
				try {
					Thread.sleep(0);
				} catch (InterruptedException e) {}
				for (int i = 0; i < 5; i++) {
					System.out.println("가위");
					try {
						Thread.sleep(2500);
					} catch (InterruptedException e){}
				}
			}		
		});
		// 바위 Thread
		Thread rock = new Thread(new Runnable() {
			public void run() {
				try {
					Thread.sleep(250);
				} catch (InterruptedException e) {}
				for (int i = 0; i < 5; i++) {
					System.out.println("바위");
					try {
						Thread.sleep(2500);
					} catch (InterruptedException e){}
				}
			}		
		});
		// 보 Thread
		Thread paper = new Thread(new Runnable() {
			public void run() {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {}
				for (int i = 0; i < 5; i++) {
					System.out.println("보");
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
