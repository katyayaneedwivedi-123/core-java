class S
{
	public static void main(String[] args) 
	{
		int i = 0;
		System.out.println(false && (i++ == i++));	//	false
		System.out.println(i);	//	0 if first operand is false then second not execute
	}
}
