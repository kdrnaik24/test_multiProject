package resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.Cricket;
import utility.Utils;

@Path("/player")
public class CricketerResources {

	@GET
	@Path("/name/{name}")
	@Produces(MediaType.APPLICATION_XML)
	public Cricket getCricketerDetails(@PathParam("name") String name)
	{
		System.out.println(name);
		Cricket ckt = Utils.doWork(name);
		System.out.println("in method");
		return ckt;
	}
	
}
