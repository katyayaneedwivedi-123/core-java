package app63;
class K extends Thread {
	@Override
	public void run() {
	for(int i = 1000; i <= 2000; i++) {
		System.out.println(i);
		int j = 10 / 0;
		System.out.println("exception is here");
	}
	}
}
public class M6a {
	static class F extends Thread {
		@Override
		public void run() {
			for(int i = 2100; i <= 3100; i++) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		K k = new K();
		k.start();
		
		F f = new F();
		f.start();

	}
}
