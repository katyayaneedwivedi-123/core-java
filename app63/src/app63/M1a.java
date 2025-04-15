package app63;

public class M1a extends Thread{
	public static void main(String[] args) {
		for(int i = 4000; i <= 5000; i ++) {
			System.out.println(i);
		}
		M1a m = new M1a();
		m.start();
		for(int i = 100; i <= 1500; i ++) {
			System.out.println(i);
		}
	}	
		public void run() {
			for(int h = 16000; h <= 17000; h++) {
				System.out.println(h);
			}
		}
}

