package com.Spring.Boot.API.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Spring.Boot.API.Entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long>{

}
