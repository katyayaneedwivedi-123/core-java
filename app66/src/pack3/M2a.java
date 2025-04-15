package pack3;

class Shared1{
	synchronized void test1() {
		String name = Thread.currentThread().getName();
		for(int i = 1; i <= 550; i++) {
			System.out.println(i);
		}
		//test2();
	}
	synchronized void test2() {
		String name = Thread.currentThread().getName();
		for(int i = 1; i <= 550; i++) {
			System.out.println(i);
		}
		test1();
	}
}
class A1 extends Thread{
	Shared1 s1;
	A1(Shared1 s1){
		this.s1 = s1;
	}
	public void run() {
		s1.test1();
	}
}
class B1 extends Thread{
	Shared1 s1;
	B1(Shared1 s1){
		this.s1 = s1;
	}
	public void run() {
		s1.test2();
	}
}
public class M2a {
	public static void main(String[] args) {
		Shared1 s1 = new Shared1();
		Shared1 s2 = new Shared1();
		A1 a1 = new A1(s1);
		s1.test1();
		
		B1 b1 = new B1(s1);
		s1.test2();
		
		System.out.println("Everything is waist");
	}
}
