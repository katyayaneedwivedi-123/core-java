package app81;

import java.io.File;

public class M15 {
	public static void main(String[] args) {
		File f1 = new File("D:/forjavaprogram");
		File[] list = f1.listFiles();
		for(File element : list) {
			System.out.println(element.getName());
		}
	}
}
//it is print all the member of directory