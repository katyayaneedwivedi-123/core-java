package pack17;
class Util{
	static void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
class Test{
	int i;
}

class A extends Thread {
	Test t;
	A(Test t){
		this.t = t;
	}
	public void run() {
		System.out.println("a:" + t.i);
		t.i += 10;
		Util.sleep(500);
		System.out.println("b:" + t.i);
		t.i += 10;
		Util.sleep(500);
		System.out.println("c:" + t.i);
		t.i += 10;
		Util.sleep(500);
		System.out.println("d:" + t.i);
	}
}
class B extends Thread {
	Test t;
	B(Test t){
		this.t = t;
	}
	public void run() {
		System.out.println("e:" + t.i);
		t.i += 10;
		Util.sleep(500);
		System.out.println("f:" + t.i);
		t.i += 10;
		Util.sleep(500);
		System.out.println("g:" + t.i);
		t.i += 10;
		Util.sleep(500);
		System.out.println("h:" + t.i);
	}
}
public class M1 {
	public static void main(String[] args) {
		Test t = new Test();
		t.i = 15;
		System.out.println("i:" + t.i);
		A a1 = new A(t);
		a1.start();
		Util.sleep(250);
		
		B b1 = new B(t);
		b1.start();
		Util.sleep(50000);
		System.out.println("j:" + t.i);
	}
}
//throw sleep method we can control the flow in this code
//i value is global to 3 threads