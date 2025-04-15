package app63;
class A2 extends Thread {
	@Override
	public void run() {
		for(int i = 1000; i <= 3000; i++) {
			System.out.println(i);	
		}
	}
}

class B2 extends Thread {
	void test() {
		for(int j = 4000; j <= 5500; j++) {
			System.out.println(j);
		}
	}
}

class C2 extends Thread {
	@Override
	public void run() {
		for(int k = 6000; k <= 7700; k ++) {
			System.out.println(k);
		}
	}
}
public class M4a {
	public static void main(String[] args) {
		for(int m = 8000; m <= 10000; m++) {
			System.out.println(m);
		}
		A2 a1 = new A2();
		a1.start();
		
		B2 b = new B2();
		b.start();
		
		C2 c = new C2();
		c.start();
		
		System.out.println("end");
	}
}
