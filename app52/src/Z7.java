class Z7
{
	public static void main(String[] args) 
	{
		String s1 = "r";
		Character obj = Character.valueOf(s1);
		char i = obj.charValue();
		System.out.println(s1);
		System.out.println(obj);
		System.out.println(i);
	}
}
//compilation error
//string can not be converted in to character object or char variable
//b/c string can have any no of character so how can multiple character
//is converted into character it takes only string