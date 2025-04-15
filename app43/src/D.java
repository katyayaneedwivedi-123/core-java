interface A
{ 
	int i = 10;//so i is also public/static eventhough we not provide(public/static/final)
}





class D 
{
	public static void main(String[] args) 
	{
		System.out.println(A.i);
	}
}
//10
//every member of interface by default public 