package app65;
class D extends Thread {
	@Override
	public void run() {
		for(int i = 1; i <= 1000; i++) {
			System.out.println(i);
		}
	}
}
public class M7 {
	public static void main(String[] args) {
		D d1 = new D();
		d1.setDaemon(true);
		d1.start();
		System.out.println("done");
	}
}
//before the execution of main method we change the Daemon
//so when ever main is stop execution then thread is automatically stop