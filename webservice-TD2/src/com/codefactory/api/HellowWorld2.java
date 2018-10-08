package com.codefactory.api;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Application;

@ApplicationPath("/api")
@Path("/test2")
public class HellowWorld2 extends Application {
	@GET
	@Path("/{name}")
	
	//GET:localhost:8080/webservice-TD2/api/test/name
	public String retournerChaine(@PathParam ("name") String chaine) {
		return chaine;
	}

}
