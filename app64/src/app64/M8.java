package app64;

public class M8 {
	public static void main(String[] args) {
		new Thread (new Runnable() {
			@Override
			public void run() {
				for(int i = 1; i <= 1000; i++) {
					System.out.println(i);
				}
			}
		}).start();
		for(int i = 5000; i <= 6000; i++) {
			System.out.println(i);
		}
	}
}
//we can use the start method without the t1