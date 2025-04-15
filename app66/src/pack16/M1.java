package pack16;

class A {
	static void test1() {
		System.out.println("test1 begin");
		synchronized (A.class) {
			for(int i = 1; i <= 1000; i++) {
				System.out.println("test1:" + i);
			}
		}   
		System.out.println("test1 end");
	}
	static void test2() {
		System.out.println("test2 begin");
		synchronized(A.class) {
			for(int i = 4000; i <= 5000; i++) {
				System.out.println("test2:" + i);
			}
		}
		System.out.println("test2 end");
	}
}
class B extends Thread{
	@Override
	public void run() {
		A.test1();
	}
}
class C extends Thread{
	@Override
	public void run() {
//		A.test1();
		A.test2();
	}
}
public class M1 {
	public static void main(String[] args) {
		B b1 = new B();
		b1.start();
		
		C c1 = new C();
		c1.start();
	}
}
//instead of synchronized entire method we can synchronized small portion of method