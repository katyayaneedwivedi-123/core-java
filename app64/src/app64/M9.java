package app64;

public class M9 {
	public static void main(String[] args) {
		new Thread (() -> {
				for(int i = 1; i <= 1000; i++) {
					System.out.println(i);
				}
		}).start();
		for(int i = 5000; i <= 6000; i++) {
			System.out.println(i);
		}
	}
}
//runnable is a functional interface so we use the lambda expression
//lambda expression allow inside a single interface