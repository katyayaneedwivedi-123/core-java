package app62;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class D1 {
	int i;
	int j;
	int k;
	int test(int i, int j, int  k) {
		System.out.println("int test type");
		return 56;
	}
}
public class M4a {
	public static void main(String[] args) throws Exception{
		Class c1 = Class.forName("app62.D1");
		D1 d = (D1) c1.newInstance();
		d.test(45, 76, 23);
		Class c2 = d.getClass();
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
