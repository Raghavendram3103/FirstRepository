package com.EmployeeController;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.EmployeeDto.EmployeeDto;
import com.EmployeeService.EmployeeService;

@Controller
@ComponentScan(basePackages = {"com.EmployeeDao","com.EmployeeService"})
public class EmployeeController {

@Autowired	
EmployeeService serv;
	
	@GetMapping("/log")
	public String getLogin(ModelMap  map)
	{
		return "login";
	}
	
	@PostMapping("/getDetails")
	public String getDetails(ModelMap map,EmployeeDto ref) throws SQLException {
		if(ref!=null) {
			serv.validateInsert(ref);
			map.addAttribute("addEmp", ref);
			map.addAttribute("msg","Data Successfully Stored");
		}
		else
		{
			map.addAttribute("msg","Data not Stored");
		}
		
		return "display";
	}
}
