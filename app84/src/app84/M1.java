package app84;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class A{
	int i;
}
public class M1 {
	public static void main(String[] args) {
		A a1 = new A();
		a1.i = 10;//writing object is a form of serialization
		try(FileOutputStream fout = new FileOutputStream("test.ser");//writing ser is not mandatory
				ObjectOutputStream out = new ObjectOutputStream(fout)){
				out.writeObject(a1);
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		System.out.println("doness");
	}
}
//writing object content is a form of serialization
//in object we use ObjectOutputStream not BufferOutputStream
//by default is not eligible for cloning in order to clone the object object should be a type of clonable in same way serialization object is not eligible for serialization 
//if we want to serialize then object should be a serializable type