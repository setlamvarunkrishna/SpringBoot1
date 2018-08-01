package io.springboot.mainapp.Employer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployerController {

	@Autowired
	EmployeeService empser;

	@RequestMapping("/employee")
	public List<EmployerDetails> allEmployee() {
		return empser.allEmployee();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/employee")
	public void addEmployee(@RequestBody EmployerDetails Emp) {
		empser.addEmployee(Emp);

	}

	

}
