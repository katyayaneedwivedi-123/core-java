package app81;

import java.io.File;

public class M9 {
	public static void main(String[] args) {
		File f1 = new File("abc");
		System.out.println(f1.exists());
		System.out.println(f1.mkdir());//it not required a try and catch
//		System.out.println(f1.isDirectory());
		System.out.println(f1.exists());
	}
}
//To create a file we should use create Newfield
//And to create a directory we should use mkdir
//for creating a directory we can go for mkdir() it method for both file and directory
//mkdir() method is not a checked exception type of a statement