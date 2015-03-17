package com.javacodegeeks.snippets.enterprise.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javacodegeeks.snippets.enterprise.model.Employee;

@Repository("employeeDAO")
public class EmployeeDAOImpl implements EmployeeDAO {
	
	String sqlQuery;

	@Autowired
	private SessionFactory sessionFactory;

	
	public void persistEmployee(Employee employee) {
		sessionFactory.getCurrentSession().persist(employee);
	}

	
	public Employee findEmployeeById(String id) {
		return (Employee) sessionFactory.getCurrentSession().get(Employee.class, id);
	}

	
	public void updateEmployee(Employee employee) {
		sessionFactory.getCurrentSession().update(employee);

	}
	
	public void deleteEmployee(Employee employee) {
		sessionFactory.getCurrentSession().delete(employee);

	}

	
	public Employee findEmployeeByUsername(String username) {
//		return (Employee) sessionFactory.getCurrentSession().get(Employee.class, username);
		sqlQuery = "SELECT * FROM  EMPLOYEE WHERE EMPLOYEE.USERNAME = " + username + ";";
		return (Employee) sessionFactory.getCurrentSession().createSQLQuery(sqlQuery);
	}

}