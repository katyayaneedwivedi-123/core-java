package app63;

public class M11 {
	public static void main(String[] args) {
		new Thread() {
			public void run() {
				for(int i = 3000; i <= 4000; i++) {
					System.out.println(i);
				}
			}
		}.start();
		
		for(int i = 13000; i <= 14000; i++) {
			System.out.println(i);
		}
	}
}
//we can direct call the main method without written the t1