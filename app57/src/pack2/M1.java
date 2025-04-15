package pack2;
class Job {
	String title;
	double salary;
}
class Employee{
	String name;
	Job[] jobs;//this is a job array. it organize the code
	//this is permanent of the employee
	Employee(String name, Job[] jobs){
		this.name = name;
		this.jobs = jobs;
	}
	class JobIterator{
		Job[] jobs;//use for the iterator purpose
		//it creating through the job iterator
		//new obj it give the 0
		private int index;
		JobIterator(Job[] jobs){
			this.jobs = jobs;
		}
		boolean hasNext() {
			return index < jobs.length;
		}
		Job nextJob() {
			return jobs[index ++];
		}//JobIterator is a inner class of the employee
	}//it encapsulated the all the job related information
	JobIterator getJobIterator() {//it is outside the job iterator 
		return new JobIterator(jobs);
	}//when the index value is greater than 3 then it give the value is 0 again
}
public class M1 {
	public static void main(String[] args) {
		Job j1 = new Job();
		j1.title = "software";
		j1.salary = 45000.0;
		
		Job j2 = new Job();
		j2.title = "sales";
		j2.salary = 25000.0;
		
		Job j3 = new Job();
		j3.title = "hr";
		j3.salary = 35000.0;
		
		Job[] jobs = {j1, j2, j3};
		Employee emp = new Employee("ramu", jobs);
		Employee.JobIterator it = emp.getJobIterator();//it return the jobIterator
		while(it.hasNext()) {
			Job obj = it.nextJob();
			System.out.println(obj.title + ", " + obj.salary);
		}
		System.out.println("---");
		it = emp.getJobIterator();
		while(it.hasNext()) {//without reset the index value is call so it not executed
			//in this loop the condition is false
			Job obj = it.nextJob();
			System.out.println(obj.title + ", " + obj.salary);
		}
	}
}

