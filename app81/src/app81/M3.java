package app81;

import java.io.File;
import java.io.IOException;

public class M3 {
	public static void main(String[] args) throws IOException{
		File f1 = new File("test.txt");
		System.out.println(f1.exists());
		System.out.println(f1.createNewFile());
		System.out.println(f1.exists());
	}
}
//before making a file is not there so it give false
//it create it a file so it give the true 
//it exist so it give true
//if we CreateNewFile() it handle to use the IOException with throws 
//create a new file only the checked exception