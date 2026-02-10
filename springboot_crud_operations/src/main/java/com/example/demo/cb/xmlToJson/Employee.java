package com.example.demo.cb.xmlToJson;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement
public class Employee 
{
	private int empid;
	private String ename;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Employee(int empid, String ename) {
		super();
		this.empid = empid;
		this.ename = ename;
	}
	
	
	

}
