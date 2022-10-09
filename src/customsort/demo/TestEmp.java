package customsort.demo;

import java.util.*;

//	customsort using int compare(type obj1 ,type obj2) method

public class TestEmp {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(101, "Gourang", "Kolhapur");
		Employee emp2 = new Employee(106, "Rohan", "Mumbai");
		Employee emp3 = new Employee(103, "Anshul", "Pune");
		Employee emp4 = new Employee(102, "Swarup", "Kolkata");
		
		TreeSet<Employee> employee = new TreeSet<Employee>(new EmpSortById());
		
		employee.add(emp1);
		employee.add(emp2);
		employee.add(emp3);
		employee.add(emp4);
		
		System.out.println(employee);
		
		TreeSet<Employee> employee1 = new TreeSet<Employee>(new EmpSortByName());
		
		employee1.add(emp1);
		employee1.add(emp2);
		employee1.add(emp3);
		employee1.add(emp4);
		
		System.out.println(employee1);
		
		TreeSet<Employee> employee2 = new TreeSet<Employee>(new EmpSortByCity());
		
		employee2.add(emp1);
		employee2.add(emp2);
		employee2.add(emp3);
		employee2.add(emp4);
		
		System.out.println(employee2);
	}
}
