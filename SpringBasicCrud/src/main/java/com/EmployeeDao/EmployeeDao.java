package com.EmployeeDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.EmployeeDto.EmployeeDto;

@Component
public class EmployeeDao {
	
	
	Connection con=null;
	PreparedStatement pst=null;
	@Autowired
	EmployeeDto dto;
	public boolean addEmployee(EmployeeDto dto) throws SQLException
	{
		boolean isInsert=false;
		
		String url = "jdbc:mysql://localhost:3306/employee";
		String username = "root";
		String pass = "root";
		String query="insert into employee_jdbc.new_table value(?,?,?,?)";
		 con = DriverManager.getConnection(url, username, pass);
		 pst = con.prepareStatement(query);
		pst.setInt(1, dto.getId());
		pst.setString(2, dto.getFirstname());
		pst.setString(3,dto.getLastname());
		pst.setInt(4,dto.getSal());
		int i = pst.executeUpdate();

		isInsert=true;
		con.close();
	
		return isInsert;
		
	}
	
	
	

}
