package app64;

public class M9a {
	public static void main(String[] args) {
		new Thread(() -> {
			System.out.println("Anonymous started");
			for(int i = 1; i <= 7777; i++) {
				System.out.println(i);
			}
			System.out.println("Anonymous end");
		}).start();
		for(int j = 7888; j <= 9999; j++) {
			System.out.println(j);
		}
	}
}
