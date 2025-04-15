package pack11;

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
//	synchronized void test2() {
//		System.out.println("test2 begin");
////		notify();
//		notifyAll();
//		System.out.println("test2 end");
//	}
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
//		a1.notifyAll();
		synchronized (a1) {
			a1.notifyAll();
		}//in this we use a1 for the object lock
	}
}
//if we not use test2 method for notify of the test1 method 
//we want to call directly so we use 
//	synchronized (a1) {
//a1.notifyAll();
//}
//we are not direct use the notifyAll();