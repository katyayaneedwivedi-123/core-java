package pack3;

class Shared {
	synchronized void test1() {
		String name = Thread.currentThread().getName();
		for(int i = 1; i <= 1000; i++) {
			System.out.println(name + "-test1-" + this + ":" + i);
		}
	}
	synchronized void test2() {
		String name = Thread.currentThread().getName();
		for(int i = 1; i <= 1000; i++) {
			System.out.println(name + "-test2-" + this + ":" + i);
		}
		test1();
	}
}

class A extends Thread{
	Shared s1;
	A(Shared s1){
		this.s1 = s1;
	}
	public void run() {
		s1.test1();
	}
}

class B extends Thread{
	Shared s1;
	B(Shared s1){
		this.s1 = s1;
	}
	public void run() {
		s1.test2();
	}
}
public class M2 {
	public static void main(String[] args) {
		Shared s1 = new Shared();
		
		A a1 = new A(s1);
		a1.start();
		
		Shared s2 = new Shared();
		
		B b1 = new B(s1);
		b1.start();
		
		System.out.println("done");
	}
}
