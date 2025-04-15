package app81;

import java.io.File;

public class M11 {
	public static void main(String[] args) {
		File f1 = new File("E:\\AI\\xyz");
		System.out.println(f1.exists());
		System.out.println(f1.mkdir());
		System.out.println(f1.exists());
	}
}
//if specified location is not available it simply return a false
//we are not getting any exception