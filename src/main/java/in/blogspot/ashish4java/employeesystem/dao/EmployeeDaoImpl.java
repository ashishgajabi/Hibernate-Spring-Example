package in.blogspot.ashish4java.employeesystem.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import in.blogspot.ashish4java.employeesystem.model.Employee;

@Repository
public class EmployeeDaoImpl extends AbstractDao implements EmployeeDao {

	@Override
	public void createEmployee(Employee emp) {
		createEntity(emp);
	}

	@Override
	public void updateEmployee(Employee emp) {
		updateEntity(emp);
	}

	@Override
	public void deleteEmployee(Employee emp) {
		deleteEntity(emp);
	}

	@Override
	public Employee getEmployee(int employeeId) {
		Session session = getsession();
		Criteria criteria = session.createCriteria(Employee.class).add(Restrictions.eq("employeeId", employeeId));
		return (Employee) criteria.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> findAllEmployees() {
		Session session = getsession();
		Criteria criteria = session.createCriteria(Employee.class);
		return (List<Employee>) criteria.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> findAllEmployeesByDesignation(String designation) {
		Session session = getsession();
		Query query = session.createQuery("from Employee where designation = :designation");
		query.setString("designation", designation);
		return query.list();
	}

}
