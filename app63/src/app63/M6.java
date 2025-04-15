package app63;
class E extends Thread {
	@Override
	public void run() {
		for(int i = 3000; i <= 4000; i++) {
			System.out.println(i);
		}
	}
}
public class M6 {
	public static void main(String[] args) {
		E e1 = new E();
		e1.start();
		e1.start();
		for(int i = 13000; i <= 14000; i++) {
			System.out.println(i);
		}
	}
}
//we can not start the same thread multiple times
//exception is rising
//in which thread is rising it terminating and the other portion executing 
//means which main thread is terminating and child is executing