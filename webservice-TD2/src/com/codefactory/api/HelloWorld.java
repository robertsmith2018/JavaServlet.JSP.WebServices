package com.codefactory.api;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.codefactory.model.student;

@ApplicationPath("/api")
@Path("/test")
public class HelloWorld extends Application {
	@GET
	@Path("/name")
	
	//GET:localhost:8080/webservice-TD2/api/test/name
	public String retournerChaine() {
		return "Cgodin 2018";
	}
	
	@GET
	@Path("/student")
	@Produces(MediaType.APPLICATION_JSON)	
	//GET:localhost:8080/webservice-TD2/api/test/name
	public Response getStudent() {
		List<student> students = new ArrayList<student>();
		student stud1 = new student(1, "Rabih", "Laval");
		student stud2 = new student(2, "Robert", "Montreal");
		student stud3 = new student(3, "Mikel", "Montreal");
		
		students.add(stud1);
		
		students.add(stud2);
		students.add(stud3);
		
		
		return Response.status(200).entity(students).build();

	}
	
	@POST
	@Path("/direbonjour")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response direBonjour(student s) {
		String msg = "Bonjour " + s.getName()+ "\n";
		msg += "Votre id est " + s.getId();
		
		return Response.status(200).entity(msg).build();
	}
	
}

