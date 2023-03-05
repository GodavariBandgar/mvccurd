package com.BikkadIT.SpringMVCWithHibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.BikkadIT.SpringMVCWithHibernate.model.Employee;
import com.BikkadIT.SpringMVCWithHibernate.service.EmployeeServiceI;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceI employeeServiceI;
	
	@GetMapping("/preRegister")
	public String preRegister() {
		
		
		return "empReg";
		
	}
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(Employee emp, Model model) {
		
		int empId = employeeServiceI.saveEmployee(emp);
		
		
		model.addAttribute("EMPID" , empId);
		
		return "userSuccess";
		
	}
	@GetMapping("/getAllEmployee")
	public String getAllEmployee(Model model){
		
		List<Employee> list = employeeServiceI.getAllEmployee();
		
		model.addAttribute("EMPLOYEELIST",list);
		
		return "allEmp";
		
	}
	
	
	
	

}
