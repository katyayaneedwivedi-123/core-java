package pack5;

class A {
	synchronized void test1() {
		System.out.println("test1 begin");
		try {
			wait();
		} 
		catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		System.out.println("test1 end");
	}
	
	synchronized void test2() {
		System.out.println("test2 begin");
		notify();
		System.out.println("test2 end");
	}
}

class Thread1 extends Thread{
	A obj;
	Thread1(A obj){
		this.obj = obj;
	}
	@Override
	public void run() {
		obj.test1();
	}
}
public class M1 {
	public static void main(String[] args) {
		System.out.println("main begin");
		A a1 = new A();
		Thread1 th1 = new Thread1(a1);
		th1.start();
		try {
			Thread.sleep(10000);
		} 
		catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		System.out.println("after sleep");
		a1.test2();//object lock of a1 required then it enter in the test2 method and notify
	}
}
//if we use the wait(); then it pause the execution and wait the notify(); when notify();
//notified the wait(); then it again resume this process is called the inter thread communication
//if thread is calling s1.wait(); or s1.notify or s1.notifyall then it required a object lock of a1
//if wait method is not access then it give the IllegalMonitorStateException