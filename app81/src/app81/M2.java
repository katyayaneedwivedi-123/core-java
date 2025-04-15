package app81;

import java.io.File;

public class M2 {
	public static void main(String[] args) {
		File f1 = new File("src");
		System.out.println(f1.isFile());
		System.out.println(f1.isDirectory());
		System.out.println(f1.length());
	}
}
//goto the app name right click goto the refresh the file then check in app file is available 