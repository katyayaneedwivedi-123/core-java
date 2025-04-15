package app65;

class E extends Thread {
	@Override
	public void run() {
		for(int i = 1; i <= 1000; i++) {
			System.out.println(i);
		}
	}
}
public class M8 {
	public static void main(String[] args) {
		E e1 = new E();
		e1.start();
		try {
			e1.join();
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("done");
	}
}
//join means if the main is having the join then main is join the end of the thread
//means parent is waiting child still continue the execution then parent join the end of the execution