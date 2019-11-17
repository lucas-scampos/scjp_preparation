package quiz.diagnostic_test;

public class Whiz31 implements Runnable {
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " ");
	}
	
	
	public static void main(String[] args) {
		Whiz31 a1 = new Whiz31();
		
		Thread t = new Thread(a1);
		t.setName("a1");
		t.start();
		
		System.out.println(Thread.currentThread().getName() + " ");
		
		try {
			t.join();
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName() + " ");
			
		}
	}
	
}
