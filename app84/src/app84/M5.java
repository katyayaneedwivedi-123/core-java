package app84;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class M5 {
	public static void main(String[] args) {
		try(FileInputStream fin = new FileInputStream("test2.ser");
				ObjectInputStream in = new ObjectInputStream(fin)){
				C c1 = (C) in.readObject();
				System.out.println(c1.i);
				System.out.println(c1.j);
				System.out.println(c1.k);
				System.out.println(c1.m);
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}
}
//transient and volatile(static) attribute is not surviving in the serialization
//static is not a part of the object
//so m is not a part of c object
//while serializing only object member considered so m is not a part
//transient is introduced only for the non serialization