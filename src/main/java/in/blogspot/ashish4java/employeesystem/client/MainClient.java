package in.blogspot.ashish4java.employeesystem.client;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.blogspot.ashish4java.employeesystem.model.Employee;
import in.blogspot.ashish4java.employeesystem.service.EmployeeService;
import in.blogspot.ashish4java.employeesystem.utils.EmployeeHelper;

public class MainClient {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeHelper empHelper = (EmployeeHelper) context.getBean("empHelper");

		EmployeeService service = (EmployeeService) context.getBean("empService");

		for (int i = 1; i < 4; i++) {
			// Cretae Employee
			service.createEmployee(empHelper.CreateEmployeeOnRequest());
		}

		// Get All Employees Details
		List<Employee> employeesList = service.findAllEmployees();;

		System.out.println();
		for (Employee employee : employeesList) {
			System.out.println(employee);
		}

		// Get All Employees with designation
		List<Employee> emplList = service.findAllEmployeesByDesignation("Full Stack Java developer");

		System.out.println();
		for (Employee employee : emplList) {
			System.out.println(employee);
		}


		context.close();

	}

}
