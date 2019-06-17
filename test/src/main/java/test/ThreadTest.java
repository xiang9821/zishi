package test;

public class ThreadTest {

	public static void main(String[] args) {
		Thread1 thread1 = new Thread1();
		thread1.run();
		System.out.println(111);
	}
}

class Thread1 implements Runnable{

	public void run() {
		try {
			System.out.println("Thread1 already start");
			Thread.sleep(1000);
			System.out.println("Thread1 already end");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}