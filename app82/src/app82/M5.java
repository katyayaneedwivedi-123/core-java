package app82;

import java.io.FileWriter;
import java.io.IOException;

public class M5 {
	public static void main(String[] args) {
		try {
			FileWriter out = new FileWriter("test5.txt", true);
			out.write("Hello to everyone");
			out.write("Hello to everyone");
			out.write("Hello to everyone");
			out.write("\n");
			out.write("Hello to everyone");
			out.write("Hello to everyone\n");
			out.write("Hello to everyone");
			out.flush();
			out.close();
			System.out.println("done");
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}
//inside of the throws we can use the try and catch 
//all the statements are the checked exception of statement