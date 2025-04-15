package app67;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class M37 {
	public static void main(String[] args) {
		Vector v1 = new Vector();
		v1.add(90);
		v1.add(190);
		v1.add(910);
		v1.add(901);
		v1.add(920);
		v1.add(390);
		v1.add(904);
		Enumeration en = v1.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());;
		}
	}
}
//in vector have a method Enumeration 
//array list is not have method and it not support the enumeration