package pack1;
class C < Z >{
	Z f1;
}
public class M3 {
	public static void main(String[] args) {
		C< ? > c1 = null;//in right hand side we assign any data type so it boundary less it can not identify
//		c1.f1 = 10;
//		c1.f1 = "abc";
//		c1.f1 = new Object();

		C< ? extends Number> c2 = null;//c2 is point to the C
//		c2.f1 = 10;//number is no final again it boundary less it have not identify the subclass to the super class	
//		c2.f1 = "abc";
//		c2.f1 = new Object();
		
		C< ? super Number> c3 = null;
		c3.f1 = 10;
//		c3.f1 = "abc";
//		c3.f1 = new Object();
		c3.f1 = 2.4;
		c3.f1 = 40L;//object is not allow here b/c it not do the down casting self
//c3 can be assign to object to number or object to object so we first we give the number then it not go to the object b/c for going to object it require the down casting but in here we not possible to the down  casting	
		
//		C < ? > c4 = null;
//		c1.f1 = 10;
//		c1.f1 = "abc";
//		c1.f1 = new Object();
//		
//		C < ? extends R > c5 = null;
//		c1.f1 = 10;
//		c1.f1 = "abc";
//		c1.f1 = new C< R >();
//		c1.f1 = new Object();
//		
//		C < ? super R > c6 = null;
//		c1.f1 = 10;
//		c1.f1 = "abc";
//		c1.f1 = new C < R >();
//		c1.f1 = new Object();
		
	}
}
//c1 can assign to any type of c object that c object is generic
//compiler check the reference type not a object type 
//means compiler check the c1 not C
//c1 is allow to point any type of C object
//if reference is a wild card type then we can not assign a value to generic field
//right hand side supply any type of data type of value there is no boundary