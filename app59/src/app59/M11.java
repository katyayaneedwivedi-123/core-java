package app59;
class Person {
	String firstName;
	String lastName;
	int age;
	double weight;
	
	public Person(String firstName, String lastName, int age, double weight) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.weight = weight;
	}
	
	//override all 3 methods
	@Override
	public String toString() {
		return "Name = " + firstName + lastName + "\n" + "Age = " + age + "\n" + "weight = " + weight; 
	}
	@Override
	public boolean equals(Object obj) {
		return (obj instanceof Person)&&
				(firstName == ((Person)obj).firstName)&&
				(lastName ==((Person)obj).lastName)&&
				(age == ((Person)obj).age)&&
				(weight == ((Person)obj).weight);
	}
	@Override
	public int hashCode() {
		String s1 = firstName;
		String s2 = lastName;
		String s3 = Integer.toString(age);
		String s4 = Double.toString(weight);
		int hash = s1.hashCode();
		hash += s2.hashCode();
		hash += s3.hashCode();
		hash += s4.hashCode();
		return hash;
	}
}
public class M11 {
	public static void main(String[] args) {
		Person p1 = new Person("dada", "hai", 27, 100.3);
		Person p2 = new Person("dada", "hai", 27, 100.3);
		System.out.println(p1.toString());
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		//develop person objects and check overrided methods
	}
}
