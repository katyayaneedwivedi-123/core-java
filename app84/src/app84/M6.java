package app84;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class D implements Serializable{
	int i;
}
public class M6 {
	public static void main(String[] args) {
		try(FileOutputStream fout = new FileOutputStream("test3.ser");
				ObjectOutputStream out = new ObjectOutputStream(fout)){
				D d1 = new D();
				d1.i = 100;
				out.writeObject(d1);
				D d2 = new D();
				d2.i = 200;
				out.writeObject(d2);
				D d3 = new D();
				d3.i = 300;
				out.writeObject(d3);
				System.out.println("done");
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}
//to the same file we can serialized any number of object