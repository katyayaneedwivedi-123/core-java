package app63;
class B extends Thread {
	@Override
	public void run() {
		for(int i = 1; i <= 1000; i++) {
			System.out.println(i);
		}
	}
}

class C extends Thread {
	@Override
	public void run() {
		for(int i = 3000; i <= 4000; i++) {
			System.out.println(i);
		}
	}
}


public class M4 {
	public static void main(String[] args) {
		B b1 = new B();//new object is created but it have no threadness feature so
		b1.start();//it newly created thread with thread schedular
		
		C c1 = new C();
		c1.start();
		
		for(int i = 9000; i <= 10000; i++) {
			System.out.println(i);
		}
	}
}
//we are getting 3 parllelly output
//we use to overriding method we execute all the for loop