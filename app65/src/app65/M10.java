package app65;

public class M10 {
	static class A extends Thread {
		@Override
		public void run() {
			System.out.println("child begin");
			try {
				Thread.sleep(20000);
			}
			catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			System.out.println("child end");
		}
	}
	public static void main(String[] args) {
		System.out.println("main begin");
		A a1 = new A();
		a1.start();
		try {
			Thread.sleep(10000);
		} 
		catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		a1.interrupt();
		System.out.println("main end");
	}
}
