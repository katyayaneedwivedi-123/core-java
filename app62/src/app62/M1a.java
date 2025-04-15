package app62;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class A1{
	int i;
	int j;
	void test1(){
		
	}
	int test2(int i, int j) {
		return 34;
	}
}
public class M1a {
	public static void main(String[] args) {
		A1 a = new A1();
		Class c1 = a.getClass();
		System.out.println(c1);
		Method[] methods = c1.getDeclaredMethods();
		for(Method m : methods) {
			System.out.println(m);
			System.out.println(45);
		}
		Field[] fields = c1.getDeclaredFields();
		for(Field f : fields) {
			System.out.println(f);
		}
	}
}
