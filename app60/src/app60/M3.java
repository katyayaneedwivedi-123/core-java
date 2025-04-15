package app60;
class C {
	C obj;
}
public class M3 {
	public static void main(String[] args) {
		C c1 = new C();
		C c2 = new C();
		C c3 = new C();
		C c4 = new C();
		
		c1.obj = c2;
		c2.obj = c3;
		c3.obj = c4;
		
		c1 = c2 = c3 = c4 = null;
		//c1 and c2 and c3 and c4 became abandoned
	}
}
//c1 containing obj 
//c2 containing obj
//c3 containing obj
//c4 containing obj
//c1 c2 c3 and c4 are all null so
//b/c no one is reached to any object so all are a 
//abandoned  this type is called a island