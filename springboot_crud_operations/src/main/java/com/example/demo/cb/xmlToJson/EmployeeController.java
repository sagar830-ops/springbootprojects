package com.example.demo.cb.xmlToJson;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController
{
	  @GetMapping(
		        value = "/emp/get/{id}",
		        produces = {"application/json", "application/xml"}
		    )
	public Employee getempDetails(@PathVariable int id)
	{
		return new Employee(id,"sagarpalamwar");
	}
}
