package app63;

public class M10 {
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				for(int i = 3000; i <= 4000; i++) {
					System.out.println(i);
				}
			}
		};
		t1.start();
		
		for(int i = 13000; i <= 14000; i++) {
			System.out.println(i);
		}
	}
}
//through anonymous class we can also develop the multiple thread