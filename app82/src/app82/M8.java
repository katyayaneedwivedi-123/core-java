package app82;

import java.io.FileWriter;
import java.io.IOException;

public class M8 {
	public static void main(String[] args) {
		FileWriter out = null;
		try {
			out = new FileWriter("test6.txt", true);//this is a checked exception
			//it have to try inside try only it should be
			out.write("Hello to everyone");
			out.write("Hello to everyone");
			out.write("Hello to everyone");
			out.write("\n");
			out.write("Hello to everyone");
			out.write("Hello to everyone\n");
			out.write("Hello to everyone");
			System.out.println("done");
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		finally {
			if(out != null) {
				try {
					out.flush();
				}
				catch(IOException ex) {
					ex.printStackTrace();
				}
				try {
					out.close();
				}
				catch(IOException ex) {
					ex.printStackTrace();
				}
			}
		}
		System.out.println("done");
	}
}
