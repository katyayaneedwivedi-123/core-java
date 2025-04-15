class A 
{
	public static void main(String[] args) 
	{
		Integer obj = Integer.valueOf(100);//boxing
		//Integer obj1 = new Integer(100);//boxing//it is also allow but we not used
		Integer obj2 = Integer.valueOf("100");//boxing// a seconf value is taking string in boxing
		int i = obj.intValue();//unboxing
		int j = obj2.intValue();
		System.out.println(obj);//obj.toString();
		System.out.println(i);
		System.out.println(obj2);
		System.out.println(j);
	}
}
/*
100
100
*/
/*
Integer is a wrapper class and built in class
in wrapper class allow to store only object
we can not allow to store the primitive 
then we need create an object to store the primitive value
we can not provide the primitive value directly
*/
/*
primitive value stroing or wrapping inside object is called a boxing
taking a copying and retrieving boxed value from the object is called a unboxing
to String method return the value is called a primitive
*/
/*
primitive datatypes				Wrapper classes
-------------------				-----------------
byte	==========>				Byte
short	==========>				Short
int		==========>				Integer
long	==========>				Long
float	==========>				Float
double	==========>				Double
boolean	==========>				Boolean
char	==========>				Character
*/
//in every wrapper class there is a overloaded value of second method is take the String 
//but the alphabets and special character are not allow