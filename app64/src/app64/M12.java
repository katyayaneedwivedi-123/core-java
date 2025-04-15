package app64;

public class M12 {
	static Thread getThread() {
		return new Thread() {
			@Override
			public void run() {
				for(int i = 1; i <= 1000; i++) {
					System.out.println(i);
				}
			}
		};
	}
	
	public static void main(String[] args) {
		getThread().start();
		for(int i = 4000; i<= 5000; i++) {
			System.out.println(i);
		}
	}
}
//we can directly keep an return