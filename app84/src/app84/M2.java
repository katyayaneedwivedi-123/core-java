package app84;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class B implements Serializable{
	int i;
}
public class M2 {
	public static void main(String[] args) {
		B b1 = new B();
		b1.i = 10;//writing object is a form of serialization
		try(FileOutputStream fout = new FileOutputStream("test.ser");//writing ser is not mandatory
				ObjectOutputStream out = new ObjectOutputStream(fout)){
				out.writeObject(b1);
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		System.out.println("doness");
	}
}
//B is serializable b/c it implement a serialization
//clonable is a marker interface so no member is there 
//same seriaizable is also a marker interface it provide the mark
//it have also no member 