package com.Spring.Boot.API.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.Boot.API.Entity.Employee;
import com.Spring.Boot.API.Repo.EmployeeRepo;

@RestController

public class EmployeeController {
	@Autowired
	private EmployeeRepo e;

	@PostMapping(value = "create")
	public Employee create(@RequestBody Employee ee) {
		Employee save = e.save(ee);
		return save;
	}
}
