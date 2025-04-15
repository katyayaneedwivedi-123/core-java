package pack9;

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
		notifyAll();
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
		A a2 = new A();
		Thread1 th1 = new Thread1(a1);
		th1.start();
		Thread1 th2 = new Thread1(a1);
		th2.start();
		Thread1 th3 = new Thread1(a2);
		th3.start();
		Thread1 th4 = new Thread1(a2);
		th4.start();
		try {
			Thread.sleep(10000);
		} 
		catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		System.out.println("after sleep");
		a1.test2();
	}
}
//in this code 2 thread have a1 and 2 thread have a2 so 
//test2 method have only a2 object lock so it send notifyAll() means notify only 2 test1 
//and 2 test1 method are resume