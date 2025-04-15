package app63;

public class M9 {
	public static void main(String[] args) {
		class A extends Thread {
			@Override
			public void run() {
				for(int i = 3000; i <= 4000; i++) {
					System.out.println(i);
				}
			}
		}
		A a1 = new A();
		a1.start();
		
		for(int i = 13000; i <= 14000; i++) {
			System.out.println(i);
		}
	}
}
//through the local inner class we can also develop in multi threading