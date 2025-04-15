class M
{
	public static void main(String[] args) 
	{
		int i = 0;
		System.out.println(true || (i++ == i));	//	true == ((i++ == i)this sentence is not executed b/c of logical or) 
		System.out.println(i);	//	0 b/c the i++ == iis not executed so it is not 1
	}
}
// if first is false then second operand is executed then the value is change 