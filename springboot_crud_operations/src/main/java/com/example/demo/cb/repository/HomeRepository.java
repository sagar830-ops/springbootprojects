package com.example.demo.cb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.cb.model.Student;

@Repository
public interface HomeRepository extends JpaRepository<Student, Integer>
{
   public Student findById(int id);
   
   @Query(value="SELECT * FROM student LIMIT 3",nativeQuery = true)
   List<Student> getFiveRecords();
}
