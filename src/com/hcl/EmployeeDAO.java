package com.hcl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAO {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int saveEmployee(Employee e) {
		String query = "insert into employee values('" + e.getEmpId()+ "','" + e.getEmpName() + "','" +
						e.getSalary() + "')" ;
		return jdbcTemplate.update(query);
	}
	public int updateEmployee(Employee e) {
		String query = "update employee set empName='" + e.getEmpName() + "',salary = '" + e.getSalary() +
				"'where empId='" + e.getEmpId() + "'";
		return jdbcTemplate.update(query);
	}
	public int deleteEmployee(Employee e) {
		String query="delete from employee where empId = '" + e.getEmpId() + "' ";
		return jdbcTemplate.update(query);
	}
	
	public List<Employee> getAllEmployees() {
		String sql = "select * from employee";
		List<Employee> list = jdbcTemplate.query(sql,  new EmployeeMapper());
		return list;
	}
}
