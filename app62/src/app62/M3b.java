package app62;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Cb {
	int i;
	int j;
	static {
		System.out.println("SIB");
	}
	{
		System.out.println("IIB");
	}
	void test(int i, int j){
		System.out.println("test method");
	}
}
public class M3b {
	public static void main(String[] args) {
		Cb c = new Cb();
		c.test(45, 67);
		try {
			System.out.println("try block started");
			Class c1 = Class.forName("app62.Cb");
			System.out.println("try block end");
		} 
		catch (ClassNotFoundException ex) {
			System.out.println("Catch block started");
			ex.printStackTrace();
			System.out.println("Catch block end");
		}
		Class c2 = c.getClass();
		System.out.println(c2);
		Field[] fields = c2.getDeclaredFields();
		for(Field f : fields) {
			System.out.println(f);
		}
		Method[] methods = c2.getDeclaredMethods();
		for(Method m : methods) {
			System.out.println(m);
		}
	}
}
