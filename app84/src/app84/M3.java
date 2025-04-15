package app84;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class M3 {
	public static void main(String[] args) {
		try(FileInputStream fin = new FileInputStream("test.ser");//writing ser is not mandatory
				ObjectInputStream in = new ObjectInputStream(fin)){
				B obj = (B) in.readObject();//it is a deserialization
				System.out.println(obj.i);
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		System.out.println("doness");
	}
}
//readobject type function is also a type of checked exception
//so it provide two type of exception 
//1. IOException
//2. ClassNotFoundException