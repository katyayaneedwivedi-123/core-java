package app62;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class A {
	int i;
	int j;
	void test1() {
		
	}
	int test2(int i) {
		return 20;
	}
}
public class M1 {
	public static void main(String[] args) {
		A a1 = new A();
		Class c1 = a1.getClass();//it return the information about the class object
		System.out.println(c1);
		Field[] fields = c1.getDeclaredFields();
		for(Field f1 : fields) {
			System.out.println(f1);
		}//use this method we more more information about the class field (variable)
		Method[] methods = c1.getDeclaredMethods();
		for(Method m1 : methods) {
			System.out.println(m1);
		}//use this method we know the more information about the class method(test)
	}
}
//getClass return the class object