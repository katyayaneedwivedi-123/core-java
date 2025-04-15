class J
{
	public static void main(String[] args) 
	{
		char i = 'a';
		Character obj = Character.valueOf(i);//boxing
		char j = obj.charValue();//unboxing
		System.out.println(obj);//obj.toString();
		System.out.println(i);
		System.out.println(j);
	}
}