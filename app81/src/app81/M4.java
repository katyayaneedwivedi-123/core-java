package app81;

import java.io.File;
import java.io.IOException;

public class M4 {
	public static void main(String[] args) throws IOException{
		File f1 = new File("hello.html");
		System.out.println(f1.exists());
		System.out.println(f1.createNewFile());
		System.out.println(f1.exists());
	}
}
//any extension is allow while making a file