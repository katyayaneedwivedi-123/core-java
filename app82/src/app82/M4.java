package app82;

import java.io.FileWriter;
import java.io.IOException;

public class M4 {
	public static void main(String[] args) throws IOException{
	FileWriter out = new FileWriter("test4.txt", true);
	//1 is file name and second is a boolean flag append method
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
}
//by default append status is false you can supply true it run 2 or 3 time it give the previous content remove
//in file writer have a several constructor we can choose to append the constructor
//after the append constructor previous data getting appended