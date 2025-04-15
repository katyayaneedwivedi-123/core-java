package app84;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class C implements Serializable{
	int i;
	transient int j;
	int k;
	static int m;
}
public class M4 {
	public static void main(String[] args) {
		C c1 = new C();
		c1.i = 10;
		c1.j = 20;
		c1.k = 30;
		c1.m = 40;
		try(FileOutputStream fout = new FileOutputStream("test2.ser");
				ObjectOutputStream out = new ObjectOutputStream(fout)){
				out.writeObject(c1);
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}
//transient and volatile(static) attribute is not surviving in the serialization
//static is not a part of the object
//so m is not a part of c object
//while serializing only object member considered so m is not a part
//transient is introduced only for the non serialization