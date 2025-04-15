package pack2;

class Job1{
	String title;
	Double salary;
}
class Employee1{
	String name;
	Job1[] job;
	private int index;
	Employee1(String name, Job1[] job){
		this.job = job;
		this.name = name;
	}
	boolean hashNext() {
		return index < job.length;
	}
	Job1 nextjob() {
		return job[index ++];
	}
}
public class M1a {
	public static void main(String[] args) {
		Job1 j1 = new Job1();
		j1.title = "Software";
		j1.salary = 55000.0;
		
		Job1 j2 = new Job1();
		j2.title = "hr";
		j2.salary = 45000.0;
		
		Job1 j3 = new Job1();
		j3.title = "Sales";
		j3.salary = 35000.0;
		
		Job1[] job = {j1, j2, j3};
		Employee1 emp = new Employee1("Aniket", job);
		while(emp.hashNext()) {
			Job1 obj = emp.nextjob();
			System.out.println(obj.title + ", " + obj.salary);
		}
		System.out.println("---------");
		while(emp.hashNext()) {
			Job1 obj = emp.nextjob();
			System.out.println(obj.title + ", " + obj.salary);
		}
	}
}
