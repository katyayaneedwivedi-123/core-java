package app81;

import java.io.File;

public class M16 {
	public static void main(String[] args) {
		File src = new File("D:/forjavaprogram");
		File[] members = src.listFiles();
		for(File member : members) {
			System.out.println(member.getName() + ":" +(member.isFile() ? " file " : "directory"));
		}
	}
}
//if it is in a file it print the file otherwise print the directory