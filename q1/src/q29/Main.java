package q29;

class Thread1 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread 1 is running");
	}
}

public class Main {
	public static void main(String[] args) {
		Thread1 thread1 = new Thread1();
		thread1.start();
		
		new Thread1() {
			public void run() {
				System.out.println("thread 2 is running");
			};
		}.start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("thread3 is running");
			}
		}).start();
	}
}
