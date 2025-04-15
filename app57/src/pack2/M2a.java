package pack2;
class Job3 {
	String title;
	Double salary;
}
class Employee2{
	String name;
	Job3[] job;	
	Employee2(String name, Job3[] job){
		this.job = job;
		this.name = name;
	}
	class jobIterator1{
		Job3[] job;
		private int index;
		jobIterator1(Job3[] job){
			this.job = job;
		}
	boolean hashNext() {
		return index < job.length;
	}
	Job3 nextjob() {
		return job[index ++];
	}
}
	public jobIterator1 getjobIterator1(){
		return new jobIterator1(job);
	}

}
public class M2a {
	public static void main(String[] args) {
		Job3 j1 = new Job3();
		j1.title = "Software";
		j1.salary = 45000.0;
		
		Job3 j2 = new Job3();
		j2.title = "hr";
		j2.salary = 35000.0;
		
		Job3 j3 = new Job3();
		j3.title = "Sales";
		j3.salary = 25000.0;
		
		Job3[] job = {j1, j2, j3};
		Employee2 emp = new Employee2("Ramesh b", job);
		Employee2.jobIterator1 it = emp.getjobIterator1();
		while(it.hashNext()) {
			Job3 obj = it.nextjob();
			System.out.println(obj.title + ", " + obj.salary);
		}
		System.out.println("---------");
		it = emp.getjobIterator1();
		while(it.hashNext()) {
			Job3 obj = it.nextjob();
			System.out.println(obj.title + ", " + obj.salary);
		}
	}
}
