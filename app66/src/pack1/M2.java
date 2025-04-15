package pack1;

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
		Shared s1 = new Shared();//if method is different and synchronized and object is same so it give the output sequentially
		
		A a1 = new A(s1);
		a1.start();
		
		Shared s2 = new Shared();//but if object also different then it give the output simultaneously
		
		B b1 = new B(s2);
		b1.start();
		
		System.out.println("done");
	}
}
//eventhough both method are different but both are synchronized both are required object lock both are the same object so it give sequential output
//A is calling test1 method and B is calling test2 method
//both are used s1 for calling the test method so s1 is required object lock
//first test1 is executed then s1 assign the object lock to B then B is executed 
// so both are give the output is sequentially
//but if we use the different method in different object then they are give the output in simultaneously