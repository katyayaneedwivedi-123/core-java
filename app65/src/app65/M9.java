package app65;

public class M9 {
	static class A extends Thread {
		public void run() {
			for(int i = 1; i <= 3000; i++) {
				try {
					Thread.sleep(1);
				} 
				catch (InterruptedException ex) {
					ex.printStackTrace();
				}
			}
			System.out.println("child done");
		}
	}
	static class B extends Thread {
			Thread main;//so it receiving main thread reference variable
			B(Thread main){
				this.main = main;
			}
			public void run() {
				System.out.println("b-started");
				try {
					Thread.sleep(1000);
				} 
				catch (InterruptedException ex) {
					ex.printStackTrace();
				}
				//main.interrupt();
			}
	}
	public static void main(String[] args) {
		System.out.println("main begin");
		Thread t1 = Thread.currentThread();
		A a1 = new A();
		a1.start();
		
		B b1 = new B(t1);//it taking constructor main thread
		b1.start();
		
		try {
			a1.join();
		} 
		catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		System.out.println("main end");
	}
}
//in this code child take a more time
//before A thread completed main thread receiving an interruption so main thread is not continue
//but main having an exception
//if main thread is not getting in B then is not getting exception