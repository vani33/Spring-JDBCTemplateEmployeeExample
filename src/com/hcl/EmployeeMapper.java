package com.hcl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
		Employee employee = new Employee();
		employee.setEmpId(rs.getInt("empId"));
		employee.setEmpName(rs.getString("empName"));
		employee.setSalary(rs.getDouble("salary"));
		return employee;
	}

}
