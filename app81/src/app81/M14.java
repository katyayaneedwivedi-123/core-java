package app81;

import java.io.File;

public class M14 {
	public static void main(String[] args) {
		File f1 = new File("a/b/c/d/test/java/src/hello");
		f1.mkdir();
		System.out.println("done");
	}
}
//mkdir() method is create chain of directory