package app65;
class A extends Thread{
	@Override
	public void run() {
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println(t1.isDaemon());
	}
}
public class M4 {
	public static void main(String[] args) {
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println(t1.isDaemon());
		System.out.println("-----------");
		A a1 = new A();
		a1.start();
	}
}
//every thread is user thread in java so daemon thread is false
//main thread priority is 5 so thread is inherited to 5