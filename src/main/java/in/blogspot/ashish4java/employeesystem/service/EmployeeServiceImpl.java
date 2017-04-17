package in.blogspot.ashish4java.employeesystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.blogspot.ashish4java.employeesystem.dao.EmployeeDao;
import in.blogspot.ashish4java.employeesystem.model.Employee;

@Service ("empService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao employeeDao;

	@Override
	public void createEmployee(Employee emp) {
		employeeDao.createEmployee(emp);

	}

	@Override
	public void updateEmployee(Employee emp) {
		employeeDao.updateEmployee(emp);
	}

	@Override
	public void deleteEmployee(Employee emp) {
		employeeDao.deleteEmployee(emp);
	}

	@Override
	public Employee getEmployee(int employeeId) {
		return employeeDao.getEmployee(employeeId);
	}

	@Override
	public List<Employee> findAllEmployees() {
		return employeeDao.findAllEmployees();
	}

	@Override
	public List<Employee> findAllEmployeesByDesignation(String designation) {
		return employeeDao.findAllEmployeesByDesignation(designation);
	}

}
