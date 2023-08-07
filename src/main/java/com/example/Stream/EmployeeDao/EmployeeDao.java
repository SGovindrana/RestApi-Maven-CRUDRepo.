package com.example.Stream.EmployeeDao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Stream.Employee.Employee;



@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {
	
    /*public static List<Employee> employees 
	= new ArrayList<Employee>
           ( Arrays.asList( 
		         	new Employee(1, "Amitabh", 20), 
		         	new Employee(2, "Ayush", 30),
		        	new Employee(3, "Amitoh", 40),
		        	new Employee(4, "AKhil", 40),
		        	new Employee(5, "Amitnath", 40)) );*/

	//public List<Employee> findAll();
}
