package com.BikkadIT.SpringMVCWithHibernate.dao;

import java.util.List;

import com.BikkadIT.SpringMVCWithHibernate.model.Employee;

public interface EmployeeDaoI {
	
	public int saveEmployee(Employee emp);
	
	public List<Employee> getAllEmployee();
	

}
