package app84;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class M7 {
	public static void main(String[] args) {
		try(FileInputStream fin = new FileInputStream("test3.ser");
			ObjectInputStream in = new ObjectInputStream(fin)){
			D obj1 = (D) in.readObject();
			System.out.println(obj1.i);
			D obj2 = (D) in.readObject();
			System.out.println(obj2.i);
			D obj3 = (D) in.readObject();
			System.out.println(obj3.i);
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}
}
//whichever order we wrote same order we getting the value means same we read