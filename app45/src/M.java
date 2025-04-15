class M
{
	public static void main(String[] args) 
	{
		int a = 130;
		short b = (byte) a;
		System.out.println(b);
	}
}
//compilation is success and runing also success
//but this type of conversion is very dangerous
//narrowing narrow is not require b/c it is more dangerous