package pack10;

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
//		notify();
		notifyAll();
		System.out.println("test2 end");
	}
}
class B extends Thread{
	A obj;
	B(A  obj){
		this.obj = obj;
	}
	@Override
	public void run() {
		obj.test1();
	}
}
class C extends Thread{
	A obj;
	C(A  obj){
		this.obj = obj;
	}
	@Override
	public void run() {
		obj.test1();
	}
}
public class M1 {
	public static void main(String[] args) {
		A a1 = new A();
		
		B b1 = new B(a1);
		b1.start();
		
		C c1 = new C(a1);
		c1.start();
		
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
//in this we have 2 thread class B and C and we have only one test2 method in main method with the a1 object lock
//if we use notify method then it not notify all then test1 method not release the all test1 method
//but if we use notifyAll() method then it notify all test1 then test1 release all the test1 