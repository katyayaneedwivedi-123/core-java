package app64;

public class M7 {
	public static void main(String[] args) {
		Thread t1 = new Thread (new Runnable() {
			@Override
			public void run() {
				for(int i = 1; i <= 1000; i++) {
					System.out.println(i);
				}
			}
		});
		t1.start();
		for(int i = 5000; i <= 6000; i++) {
			System.out.println(i);
		}
	}
}
//direct Runnable type is used