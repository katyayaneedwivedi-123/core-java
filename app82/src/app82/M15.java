package app82;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class M15 {
	public static void main(String[] args) {
		try(FileReader fin = new FileReader("test.txt")) {
			BufferedReader in = new BufferedReader(fin);
			String s1;
			int count = 0;
			while((s1 = in.readLine()) != null) {
				System.out.println(s1);
				count++;
			}
			System.out.println(count);
		} 
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
