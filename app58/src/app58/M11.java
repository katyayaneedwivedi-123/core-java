package app58;
class Employee
{
	
}
class PermanentEmployee extends Employee
{
	
}
class ContractEmployee extends Employee
{
	
}
class SalesEmployee extends Employee
{
	
}
class MarketingEmployee extends SalesEmployee
{
	
}
class Q <A extends Employee> {
	A f1;
}
public class M11 {
	public static void main(String[] args) {
//		PermanentEmployee p = new PermanentEmployee();
//		System.out.println("jaskfhewuh");
		
		Q <Employee> q1 = new Q <Employee>();
		q1.f1 = new Employee();
		
		Q <PermanentEmployee> q2 = new Q <PermanentEmployee>();
		q2.f1 = new PermanentEmployee();
		
		Q <ContractEmployee> q3 = new Q <ContractEmployee>();
		q3.f1 = new ContractEmployee();
		
		Q <SalesEmployee> q4 = new Q <SalesEmployee>();
		q4.f1 = new SalesEmployee();
		
		Q <MarketingEmployee> q5 = new Q <MarketingEmployee>();
		q5.f1 = new MarketingEmployee();
		
//		Q <String> q6 = new Q <String>();
//		q6.f1 = "abc";
		
	}
}
//string is not a subclass of the employee so it give 
//compilation error
//if we comment the String lines then it compile successfully
//if we want generic for a particular class then we go for the extends