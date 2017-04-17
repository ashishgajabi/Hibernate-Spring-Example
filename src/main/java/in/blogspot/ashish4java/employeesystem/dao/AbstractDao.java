package in.blogspot.ashish4java.employeesystem.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class AbstractDao {

	@Autowired
	SessionFactory sessionFactory;

	protected Session getsession() {
		return sessionFactory.getCurrentSession();
	}

	public void createEntity(Object entity) {
		getsession().save(entity);
	}

	public void updateEntity(Object entity) {
		getsession().update(entity);
	}

	public void deleteEntity(Object entity) {
		getsession().delete(entity);
	}

}
