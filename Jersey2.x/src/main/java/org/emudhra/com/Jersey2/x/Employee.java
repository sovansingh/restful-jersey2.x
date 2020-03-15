package org.emudhra.com.Jersey2.x;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/emp")
public class Employee {

	@Path("/emsg")
	@GET
	public String showMsg() {
		return "Hello";
	}
}
