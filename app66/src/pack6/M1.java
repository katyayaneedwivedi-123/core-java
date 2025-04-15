package pack6;

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
		A a2 = new A();
		Thread1 th1 = new Thread1(a1);
		th1.start();
		try {
			Thread.sleep(10000);
		} 
		catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		System.out.println("after sleep");
		a2.test2();//object lock of a1 required then it enter in the test2 method and notify
		//but it have a2 object lock so it not give the notify to the test1 so test1 is not release
	}
}
