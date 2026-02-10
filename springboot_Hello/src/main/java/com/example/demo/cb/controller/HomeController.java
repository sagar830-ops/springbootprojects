package com.example.demo.cb.controller;

import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController
{
	
	
	@GetMapping
    public String checkmsg()
    {
    	return "Yes! it's working fine";
    }
	
	
	
	
	
}
