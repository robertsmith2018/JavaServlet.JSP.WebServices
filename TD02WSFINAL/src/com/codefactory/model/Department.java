package com.codefactory.model;

import java.util.List;

public class Department {
	private int numDept;
	private String nameDept;
	
	private List<Student> students;
	
	public Department() {
		
	}
	
	public Department(String nameDept) {
		this.nameDept = nameDept;
	}
	public Department(int numDept, String nameDept) {
		this.numDept = numDept;
		this.nameDept = nameDept;
	}

	public int getNumDept() {
		return numDept;
	}

	public void setNumDept(int numDept) {
		this.numDept = numDept;
	}

	public String getNameDept() {
		return nameDept;
	}

	public void setNameDept(String nameDept) {
		this.nameDept = nameDept;
	}
	
	
	

}
