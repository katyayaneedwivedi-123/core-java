package app84;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class E implements Serializable{
	int i;
}
public class M8 {
	public static void main(String[] args) throws Exception{
		FileOutputStream fout = new FileOutputStream("test4.ser");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		E obj = new E();
		obj.i = 100;
		out.writeObject(obj);
		FileInputStream fin = new FileInputStream("test4.ser");
		ObjectInputStream in = new ObjectInputStream(fin);
		E ref = (E) in.readObject();
		System.out.println(obj.i);
		System.out.println(ref.i);
		System.out.println("-----------");
		obj.i = 200;
		System.out.println(obj.i);
		System.out.println(ref.i);
		System.out.println("-----------");
		ref.i = 400;
		System.out.println(obj.i);
		System.out.println(ref.i);
		System.out.println("-----------");
	}
}
//we use throws exception for handling the both exception
//if we do the changes in serialized (obj) is not effect in the deserialized(ref)
//means changes in original is not reflecting to deserialized if changes in deserialized then changes is not reflecting to original this is called a deep copy operation