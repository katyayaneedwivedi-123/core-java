package app64;

public class M9b {
	class B implements Runnable{
		@Override
		public void run() {
			System.out.println("started");
			for(int i = 12300; i <= 14000; i++) {
				System.out.println(i);
			}
			System.out.println("end");
		}
	}
	public static void main(String[] args) {
		B b1;
		M9b m9 = new M9b();
		   b1 =  m9. new B();
		Thread t1 = new Thread(b1);
		t1.start();
		System.out.println("start begin");
		for(int i = 20000; i<= 40000; i++) {
			System.out.println(i);
		}
		System.out.println("start end");
	}
}
