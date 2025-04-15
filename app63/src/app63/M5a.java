package app63;
class A3 extends Thread {
	@Override
	public void run() {
		for(int i = 4500; i <= 5900; i++) {
			System.out.println(i);
		}
	}
}
public class M5a {
	public static void main(String[] args) {
		
		A3 a1 = new A3();
		a1.start();
		
		A3 a2 = new A3();
		System.out.println("exception");
		a2.start();
		a2.start();
		a2.start();
		
		for(int i = 6000; i <= 7000; i++) {
			System.out.println(i);
		}
	}
}
