package com.codefactory.api;

import javax.ws.rs.core.Application;

import com.codefactory.model.Department;
import com.codefactory.model.SchoolManager;
import com.codefactory.model.Student;

import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.ws.rs.core.Application;

@ApplicationPath("/api")
@Path("/school")
//appel:http://localhost:8080/TD02WSFINAL/api/school/department*/
public class StudentAPI extends Application {
	
	@GET
	@Path("/department")
	@Produces(MediaType.APPLICATION_JSON)
	public Response wsToGetDepartments() {
		SchoolManager manager = new SchoolManager();
		List<Department> departments = manager.getDepartments();
		return Response.status(200).entity(departments).build();
		
	}
	

	@POST
	@Path("/department")
	@Consumes(MediaType.APPLICATION_JSON)
	public void wsToAddDepartments(Department d) {
		SchoolManager manager = new SchoolManager();
		manager.addDepartment(d.getNameDept());
	}
		
	
	/* //appel:http://localhost:8080/TD02WSFINAL/api/school/department 
	 * 
	 * Post
	 * 
	 * Postman
	 * {
			"nameDept":"Fiscalité"
	   }
	 */
	
	@POST
	@Path("/student")
	@Consumes(MediaType.APPLICATION_JSON)
	public String wsToAddStudent(Student s) {
		SchoolManager manager = new SchoolManager();
		int result = manager.addStudent(s);
		
		if(result == 0 ) {
			return "Probleme lors de INSERT";
		}else {
			return "INSERT avec success";
		}
	}
	/*
	{
		"numStud":"8",
		"nameStud":"Thomas",
		"numDept":2
	}
	*/	
	
	
}
