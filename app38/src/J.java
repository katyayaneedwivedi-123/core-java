class I
{
	I()
	{
		System.out.println("I()");//I class construtcor can not call to the J class constructor 
	}
}
class J extends I
{
	J()
	{
		//super();//compiler provide a this type of statement
		System.out.println("J()");//j class constructor giving a call to I class constructor
	}
	
	public static void main(String[] args) 
	{
		I obj1 = new I();
		System.out.println("------------------");
		J obj2 = new J();
		System.out.println("------------------");
	}
}
/*
I()
------------------
I()
J()
------------------
*/
//in this totally 3 constructor 1 is I 2 is J and 3 is object