package pack15;

class A {
	static synchronized void test1() {
		for(int i = 1; i <= 1000; i++) {
			System.out.println("test1:" + i);
		}
	}
	static synchronized void test2() {
		for(int i = 4000; i <= 5000; i++) {
			System.out.println("test2:" + i);
		}
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
//we can use synchronized the static method to avoid the simultaneous execution
//we can organized this use of synchronization
//it give the sequential execution
//in static synchronization require a only one class lock
//one class having only one class lock