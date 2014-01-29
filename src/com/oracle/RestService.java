package com.oracle;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("v1/status")
public class RestService {
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle(){
	 	return "<p>Hell Rest</p>";	
		}

}
