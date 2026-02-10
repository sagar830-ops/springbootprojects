package com.example.demo.cb.serviceImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.cb.model.Student;
import com.example.demo.cb.repository.HomeRepository;
import com.example.demo.cb.service.HomeService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class HomesServiceImpl implements HomeService
{
   @Autowired
   private HomeRepository hp;
	
	@Override
	public void save(Student s) 
	{
		hp.save(s);
		
	}

	@Override
	public List<Student> getAllDetails() {
		// TODO Auto-generated method stub
		
		List<Student> list = hp.findAll();
		
		return list;
	}

	@Override
	public Student findById(int id) {
		// TODO Auto-generated method stub
		
	Student stu = hp.findById(id);
		return stu;
	}

	
	@Override
	public List<Student> updateDetails() {
		// TODO Auto-generated method stub
		
		  List<Student> list = hp.findAll();
		
		return list;
	}

	@Override
	public String deleteID(int id) {

       hp.deleteById(id);
       
       return null;
       
		
	}

	@Override
	public List<Student> getFiveRecord() {
		// TODO Auto-generated method stub
		
		 Pageable page = (Pageable) PageRequest.of(0, 5);
		
		 Page<Student> stu = hp.findAll(page);
		
		return stu.getContent();
	}

	@Override
	public List<Student> get3Record() {
		// TODO Auto-generated method stub
		return hp.getFiveRecords();
	}

	
	
	
	

}
