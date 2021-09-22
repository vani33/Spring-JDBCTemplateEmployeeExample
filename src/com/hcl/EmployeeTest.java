package com.hcl;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring.xml");
		EmployeeDAO employeeDAO = (EmployeeDAO)ctx.getBean("employeeDAO");
		/*int status = employeeDAO.saveEmployee(new Employee(101,"Raj" , 45000));
		System.out.println(status);
		if(status == 1) {
			System.out.println("Insert Successful");
		}
		else {
			System.out.println("Insertion could not be done");
		}*/
		
		/*int status = employeeDAO.updateEmployee(new Employee(101, "Raj" , 50000));
		System.out.println(status);
		if(status == 1) {
			System.out.println("Update Successful");
		}
		else {
			System.out.println("update could not be done");
		}*/
		
		/*Employee employee = new Employee();
		employee.setEmpId(101);
		int status = employeeDAO.deleteEmployee(employee);
		if(status == 1) {
			System.out.println("Delete Successful");
		}
		else {
			System.out.println("Deletion could not be done");
		}*/
		
		List<Employee> employee = employeeDAO.getAllEmployees();
		for(Employee e: employee ) {
			System.out.println(e.getEmpId() + " " + e.getEmpName()+" " + e.getSalary());
		}
	}
}
