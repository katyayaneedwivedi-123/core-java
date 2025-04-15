interface A
{
}  
interface B
{
}

class Q implements A, B 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
//compile successfully
//java supports multiple inheritance through super interfaces