package pack13;

class B extends Thread{
	@Override
	public void run() {
		System.out.println("b-thread-begin");
		synchronized (this) {//we use this in the place of the obj b/c we have no classA so we no use this
			//so this is a work as the place of the obj
			try {
				this.wait();
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//in B class have already a wait method so we not use A class then we also not use
		//obj in the place of obj we use this
		System.out.println("b-thread-end");
	}
}
class C extends Thread{
	@Override
	public void run() {
		System.out.println("c-thread-begin");
		synchronized (this) {
			try {
				this.wait();
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("c-thread-end");
	}
}
public class M1 {
	public static void main(String[] args) {
		B b1 = new B();
		b1.start();
		
		C c1 = new C();
		c1.start();
		
		try {
			Thread.sleep(10000);
		} 
		catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		System.out.println("after sleep");
//		a1.notifyAll();
		synchronized (b1) {
			b1.notifyAll();
		}
		synchronized (c1) {
			c1.notifyAll();
		}
	}
}
//if we not use the A class then we not use obj and we also use wait and notify
//b/c B and C also containing the wait  method so no need of A class
//and we use the b1 synchronized notifyAll and c1 synchronized notifyAll method