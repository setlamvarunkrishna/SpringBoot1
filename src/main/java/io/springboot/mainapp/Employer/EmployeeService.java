package io.springboot.mainapp.Employer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	public List<EmployerDetails> employee = new ArrayList<>( Arrays.asList(new EmployerDetails("12WJ", "Gurunanak", 25),
			new EmployerDetails("12WA", "Sri Indu", 23)));

	// return all employees
	public List<EmployerDetails> allEmployee() {
		return employee;
	}

	// to add employee

	public void addEmployee(EmployerDetails emp) {
		employee.add(emp);

	}

}
