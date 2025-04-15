package app81;

import java.io.File;
import java.io.IOException;

public class M7 {
	public static void main(String[] args) {
		File f1 = new File("D:/forjavaprogram/app71/src","hello.doc");//multiple constructor available 
		//first argument is a location and second argument is a file name
		System.out.println(f1.exists());
		try {
			System.out.println(f1.createNewFile());
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		System.out.println(f1.exists());
	}
}
