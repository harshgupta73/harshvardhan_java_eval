package q21;

class Sleep extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread is on sleep");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("thread is awake");
	}
}

public class Main {
	public static void main(String[] args) {
		Sleep sleep = new Sleep();
		sleep.start();
	}
}
