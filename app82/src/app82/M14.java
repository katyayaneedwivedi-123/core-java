package app82;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class M14 {
	public static void main(String[] args) {
		try(FileReader fin = new FileReader("test.txt")) {
			BufferedReader in = new BufferedReader(fin);
			String s1;
			while((s1 = in.readLine()) != null) {
				System.out.println(s1);
			}
		} 
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
