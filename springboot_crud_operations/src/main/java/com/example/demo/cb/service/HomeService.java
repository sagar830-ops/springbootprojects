package com.example.demo.cb.service;

import java.util.List;

import com.example.demo.cb.model.Student;

public interface HomeService 
{
	public void save(Student s);
	public List<Student> getAllDetails();
	public Student findById(int id);
	
	public List<Student> updateDetails();
    public String deleteID(int id);
    
    //pagination
    public List<Student> getFiveRecord();
    
  //pagination
    public List<Student> get3Record();
    
    
    
	

}
