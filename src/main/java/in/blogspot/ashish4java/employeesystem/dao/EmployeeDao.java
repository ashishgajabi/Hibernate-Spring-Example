package in.blogspot.ashish4java.employeesystem.dao;

import java.util.List;

import in.blogspot.ashish4java.employeesystem.model.Employee;

public interface EmployeeDao {

	void createEmployee(Employee emp);

	void updateEmployee(Employee emp);

	void deleteEmployee(Employee emp);

	Employee getEmployee(int employeeId);

	List<Employee> findAllEmployees();

	List<Employee> findAllEmployeesByDesignation(String designation);

}
