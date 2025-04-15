package app64;

public class M6 {
	public static void main(String[] args) {
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				for(int i = 1; i <= 1000; i++) {
					System.out.println(i);
				}
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
		
		for(int i = 5000; i <= 6000; i++) {
			System.out.println(i);
		}
	}
}
//we can also go for the anonymous inner class type