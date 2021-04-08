package org.emp;

import org.sample.Student;

public class EmployeeInfo {

	public void empDomain() {
		System.out.println("Automation Testing");
	}

	public void companyName() {
		System.out.println("Company name is xxx");
	}

	public void companyAddress() {
		System.out.println("Company address is abc");
	}

	public static void main(String[] args) {
		EmployeeInfo ei = new EmployeeInfo();
		ei.empDomain();
		ei.companyAddress();
		ei.companyName();
		Student s = new Student();
		s.studentId();
		s.studentName();
		s.studentSubject();
	}
}
