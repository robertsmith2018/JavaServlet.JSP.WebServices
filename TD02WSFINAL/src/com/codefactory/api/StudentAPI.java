package com.codefactory.api;

import javax.ws.rs.core.Application;

import com.codefactory.model.Department;
import com.codefactory.model.SchoolManager;

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
	
	
	
}
