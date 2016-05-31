package restjersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

// Identifies the URI path that a resource class or class method will serve requests for
@Path("/ctofservice")
public class CtoFService {
	// Indicates that the annotated method responds to HTTP GET requests
	@GET
	// Defines the media type(s) that the methods of a resource class or
	// MessageBodyWriter can produce. If not specified then a container will
	// assume that any type can be produced
	@Produces("application/xml")
	public String convertCtoF() {

		Double fahrenheit;
		Double celsius = 36.8;
		fahrenheit = ((celsius * 9) / 5) + 32;

		String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n" + fahrenheit;
		return "<ctofservice>" + "<celsius>" + celsius + "</celsius>" + "<ctofoutput>" + result + "</ctofoutput>"
				+ "</ctofservice>";
	}

	@Path("{c}")
	@GET
	@Produces("application/xml")
	public String convertCtoFfromInput(@PathParam("c") Double c) {
		Double fahrenheit;
		Double celsius = c;
		fahrenheit = ((celsius * 9) / 5) + 32;

		String result = "@Produces(\"application/xml\") Output: \n\nC to F Converter Output: \n\n" + fahrenheit;
		return "<ctofservice>" + "<celsius>" + celsius + "</celsius>" + "<ctofoutput>" + result + "</ctofoutput>"
				+ "</ctofservice>";
	}
}