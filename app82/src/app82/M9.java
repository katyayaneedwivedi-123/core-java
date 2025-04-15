package app82;

import java.io.FileWriter;
import java.io.IOException;

public class M9 {
	public static void main(String[] args) {
		try (FileWriter out = new FileWriter("test6.txt", true)){
			out.write("Hello to everyone");
			out.write("Hello to everyone");
			out.write("Hello to everyone");
			out.write("\n");
			out.write("Hello to everyone");
			out.write("Hello to everyone\n");
			out.write("Hello to everyone");
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}
//in JDK 7 or 1.7 introduced the automatically perform operation
//when if an any exception occur and we use try catch then it automatically close this  