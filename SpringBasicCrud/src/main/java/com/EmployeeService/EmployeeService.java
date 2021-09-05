package com.EmployeeService;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.EmployeeDao.EmployeeDao;
import com.EmployeeDto.EmployeeDto;

@Component
public class EmployeeService {
	@Autowired
	EmployeeDao dao;
	public boolean validateInsert(EmployeeDto dto) throws SQLException {
		if(dto.getId()<=0) {
			return false;
		}
		//return check.addEmployee( info );
		return dao.addEmployee(dto);
	}

}
