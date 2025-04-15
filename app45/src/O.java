class O
{
	public static void main(String[] args) 
	{
		int a = 140;
		short b = (short) (byte) a;
				//first it converted into short then byte so it give the negative value
		System.out.println(b);
	}
}
/*
-116
*/
//converting is required but converting in to different type is not allow
//