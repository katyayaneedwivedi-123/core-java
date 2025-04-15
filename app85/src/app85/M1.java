package app85;
interface A {
	static void test() {
		System.out.println("A = test");
	}
}
public class M1 {
	public static void main(String[] args) {
		A.test();
	}
}
//in jdk 1.8 have a two defined methods
//1. static defined method
//2. default method