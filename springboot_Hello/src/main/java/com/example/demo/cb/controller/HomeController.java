package com.example.demo.cb.controller;

import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.cb.model.Student;
import com.example.demo.cb.service.HomeService;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;

@RestController
@Validated
public class HomeController
{
	
	
	@GetMapping
    public String checkmsg()
    {
    	return "Yes! it's working fine";
    }
	
	
	
	
	
}
