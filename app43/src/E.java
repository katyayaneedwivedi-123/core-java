interface A
{
	int i;//i is not only static it is final and it is not declaring 
}



class E 
{
	public static void main(String[] args) 
	{
		System.out.println(A.i);
	}
}
//compilation error
//final variable should be initialize while it is declaring or in the possible initializer