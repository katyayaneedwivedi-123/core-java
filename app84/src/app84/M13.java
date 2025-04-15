package app84;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class M13 {
	public static void main(String[] args) throws Exception{
		FileInputStream fin = new FileInputStream("test25.ser");
		ObjectInputStream in = new ObjectInputStream(fin);
		R obj = (R) in.readObject();
		System.out.println(obj.i);
	}
}
//R class object is deserialized here 
//what are R class is reading and whatever the current 
//we can not do the desiarization directly b/c the current serializing class object is not written in the class so it can not do directly 