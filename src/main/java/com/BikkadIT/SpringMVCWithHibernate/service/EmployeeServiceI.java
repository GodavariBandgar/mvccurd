package com.BikkadIT.SpringMVCWithHibernate.service;

import java.util.List;

import com.BikkadIT.SpringMVCWithHibernate.model.Employee;

public interface EmployeeServiceI {
	
	public int saveEmployee(Employee emp);
	
	public List<Employee> getAllEmployee();
	

}
