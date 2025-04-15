package pack14;
class A {
	static void test1() {
		for(int i = 1; i <= 1000; i++) {
			System.out.println("test1:" + i);
		}
	} 
	static void test2() {
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
//2 thread going on test1 both are executed simultaneously
//if both thread use different different test then they also 
//give the simultaneous execution
//b/c both are not synchronized
//static method can also synchronized to avoid simultaneous execution