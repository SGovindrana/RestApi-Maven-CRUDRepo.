package com.example.Stream.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Stream.Employee.Employee;
import com.example.Stream.EmployeeDao.EmployeeDao;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDao employeeDao;
    
	public List<Employee> getEmployees(){
		
		return (List<Employee>) employeeDao.findAll();
	    }
	
	public String saveEmployee(Employee emp) {
		employeeDao.save(emp);
		return "Data Saved Successfully";
	}
	
	public String saveEmployeeList(Iterable<Employee> emp) {
		employeeDao.saveAll(emp);
		return "Data Saved Successfully";
	}
	
	
	public Employee getEmployee(int id) {
	
		List<Employee> emp = (List<Employee>) employeeDao.findAll();
		
		return emp.stream().filter(t -> t.getId() == id).findFirst().get(); 
	 }
	 
	public List<Employee> getEmployee(String name){
	
		List<Employee> emp = (List<Employee>) employeeDao.findAll();
		
		List<Employee> FilteredList = emp.stream().filter(e->e.getName().contains(name)).collect(Collectors.toList());
		return FilteredList ; 
	}
	

}
