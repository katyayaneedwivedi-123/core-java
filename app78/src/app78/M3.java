package app78;

public class M3 {
	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		int k = i + j;
		String s1 = String.format("%3$d is sum of %1$d and %2$d", i, j, k);
		System.out.println(s1);
		System.out.printf("%3$d is sum of %1$d and %2$d", i, j, k);
	}
}
