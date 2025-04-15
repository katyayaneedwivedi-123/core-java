package app81;

import java.io.File;
import java.io.IOException;

public class M13 {
	public static void main(String[] args) throws IOException{
		File f1 = new File("D:/forjavaprogram");
		File f2 = new File(f1, "bin");//first name is a reference variable and second is a directory name
		File f3 = new File(f1,"Test.java");
		f2.mkdir();
		f3.createNewFile();
		System.out.println("done");
	}
}
//here mkdir() method is a directory for f2 
//and createNewFile() method is for the f3
