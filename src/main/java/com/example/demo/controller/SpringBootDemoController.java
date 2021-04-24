package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;

 
@RestController
public class SpringBootDemoController {
	@GetMapping("/employees")
	public List<Employee> getAllEmployee(){
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee(1,"aaaa111","bbbb111"));
		emps.add(new Employee(2,"aaaa222","bbbb222"));
		emps.add(new Employee(3,"aaaa333","bbbb333"));
		emps.add(new Employee(4,"aaaa444","bbbb444"));
		emps.add(new Employee(5,"aaaa555","bbbb555"));
		return emps;
	}
	
}
