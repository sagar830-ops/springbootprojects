package com.example.demo.cb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.cb.model.Student;
import com.example.demo.cb.service.HomeService;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;

@RestController
@Validated
public class HomeController
{
	@Autowired
	private HomeService hs;
	
	@GetMapping
    public String checkmsg()
    {
    	return "Yes! it's working fine";
    }
	
	@PostMapping("/save")
	public String saveStuDetails(@Valid @RequestBody Student s)
	{
		 hs.save(s);
		 
		 return "Successful regster Student Details!!";
	}
	
	@GetMapping("/get")
	public List<Student> getDetails()
	{
	 	 List<Student> list = hs.getAllDetails();
	 	 return list;
	}
	
	@GetMapping("/get/{rollno}")
	public Student FindId(@Min(1) @PathVariable("rollno") int rollno)
	{
		 Student stu = hs.findById(rollno);
		 return stu;
	}
	
	//http://localhost:8080/getparam?rollno=1
	@GetMapping("/getparam")
	public Student FindIdD(@RequestParam int rollno)
	{
		 Student stu = hs.findById(rollno);
		 return stu;
	}
	
	@PutMapping("/up")
	public List<Student> updateDB(@RequestBody Student s)
	{
		hs.save(s);
		
		List<Student> list = hs.getAllDetails();
	 	return list;
		
	}
	
	@DeleteMapping("/del/{id}")
	public List<Student> updateDB(@PathVariable("id") int id)
	{
		hs.deleteID(id);
		
		List<Student> list = hs.getAllDetails();
	 	return list;
		
	}
	
	@GetMapping("/getfive")
	public List<Student> getFiveRecord()
	{
		List<Student> list = hs.getFiveRecord();
		
		return list;
	}
	
	@GetMapping("/get3")
	public List<Student> get3Record()
	{
		List<Student> list = hs.get3Record();
		
		return list;
	}
	
	
	
}
