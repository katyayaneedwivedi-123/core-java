package app64;
class C implements Runnable {
	@Override
	public void run() {
		for(int i = 1; i <= 1000; i++) {
			System.out.println(i);
		}
	}
}

class D implements Runnable {
	@Override
	public void run() {
		for(int i = 14000; i <= 15000; i++) {
			System.out.println(i);
		}
	}
}
public class M3 {
	public static void main(String[] args) {
		C c1 = new C();
		Thread t1 = new Thread();
		t1.start();
		
		D d1 = new D();
		Thread t2 = new Thread();
		t2.start();
		
		for(int i = 21000; i <= 22000; i++) {
			System.out.println(i);
		}
	}
}
//there are 2 runnable class C and D 
//by using multi threading it do 