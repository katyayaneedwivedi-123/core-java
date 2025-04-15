package app64;
class B implements Runnable {
	@Override
	public void run() {
		for(int i = 1; i <= 1000; i++) {
			System.out.println(i);
		}
	}
}
public class M2 {
	public static void main(String[] args) {
		B b1 = new B();

		Thread t1 = new Thread(b1);
		t1.start();
		
		Thread t2 = new Thread(b1);
		t2.start();
		
		Thread t3 = new Thread(b1);
		t3.start();
		
		for(int i = 1; i <= 1000; i++) {
			System.out.println(i);
		}
	}
}
//by using same runnable object we can create multiple thread