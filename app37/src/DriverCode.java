class Person 
{
	String name;
	double weight;
	int age;
}
class DriverCode
{	
	public static void main(String[] args) 
	{
		Person p1 = new Person();
		p1.name = "Murali";
		p1.weight = 78.9;
		p1.age = 67;
			
		Person p2 = new Person();
		p2.name = "Swetha";
		p2.weight = 58.9;
		p2.age = 45;
		
		Person p3 = new Person();
		p3.name = "Suresh";
		p3.weight = 68.9;
		p3.age = 25;
			
		System.out.println(p1.name + ", " + p1.weight + ", " + p1.age);
		System.out.println(p2.name + ", " + p2.weight + ", " + p2.age);
		System.out.println(p3.name + ", " + p3.weight + ", " + p3.age);
	}
}
/*
Murali, 78.9, 67
Swetha, 58.9, 45
Suresh, 68.9, 25
*/