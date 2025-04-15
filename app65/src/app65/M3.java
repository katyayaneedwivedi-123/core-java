package app65;

public class M3 {
	public static void main(String[] args) {
		Thread t1 = Thread.currentThread();
		t1.setDaemon(true);
		System.out.println(t1.isDaemon());
	}
}
//we can not change the main thread into daemon 
//if we try to change then it give the IllegalThreadStateException
//the output is java.lang.IllegalThreadStateException