package in.blogspot.ashish4java.employeesystem.utils;

import java.util.Random;

import org.springframework.stereotype.Component;

import in.blogspot.ashish4java.employeesystem.model.Employee;

@Component ("empHelper")
public class EmployeeHelper {

	private static final String designation = "Full Stack Java developer";

	public Employee CreateEmployeeOnRequest() {
		Random r = new Random();
		Employee emp = new Employee();
		emp.setFirstName("ABC" + r.nextInt(100));
		emp.setLastName("XYZ" + r.nextInt(100));
		emp.setDesignation(designation);
		return emp;
	}

}
