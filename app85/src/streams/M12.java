package streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class M12 {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("abc", 60000));
		employees.add(new Employee("xyz", 20000));
		employees.add(new Employee("vijay", 40000));
		employees.add(new Employee("bhanu", 10000));
		
		List<Employee> r1 = employees.stream().sorted(
				(emp1, emp2) -> emp1.getFirstname().compareTo(emp2.getFirstname())).collect(Collectors.toList());
		System.out.println(r1);
		
		List<Employee> r2 = employees.stream().sorted(
				(emp1, emp2) -> emp1.getsalary().compareTo(emp2.getsalary())).collect(Collectors.toList());
		System.out.println(r2);
	}
}
//r1 is sorted on the basis of the employees name
//r2lis sorted on the basis of the employees salary