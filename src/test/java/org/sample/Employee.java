package org.sample;

public class Employee {

	public void empName() {
		System.out.println("Emp name is abc");
	}

	public void empId() {
		System.out.println("Emp id is 12345");
	}

	public void empSalary() {
		System.out.println("Emp Salary is 56865.09");
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.empName();
		e.empId();
		e.empSalary();
		Student s = new Student();
		s.studentId();
		s.studentName();
		s.studentSubject();
	}
}
