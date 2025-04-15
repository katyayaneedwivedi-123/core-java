package app63;

public class M8 {
	static class A extends Thread {
		@Override
		public void run() {
			for(int i = 3000; i <= 4000; i++) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		A a1 = new A();
		a1.start();
		
		for(int i = 13000; i <= 14000; i++) {
			System.out.println(i);
		}
	}
}
//we can develop the inner classes (non static and static also)
