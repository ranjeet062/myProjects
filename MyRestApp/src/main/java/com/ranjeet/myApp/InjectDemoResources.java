package com.ranjeet.myApp;

import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("/injectdemo")  
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class InjectDemoResources {

	@GET
	@Path("/annotation")
	public String getParamUsingAnotation(@MatrixParam("param") String matrixParam,
										 @HeaderParam("customHeaderValue") String customHeaderValue,
										 @CookieParam("name") String cookie ) {
		return "MatrixParam: "+ matrixParam +" ,CustomHeader: " + customHeaderValue + ", Cookie: "+ cookie;
	}
	
	@GET
	@Path("/context")
	public String getParamUsingContext(@Context UriInfo uriInfo,
									   @Context HttpHeaders headers) {
		String path = uriInfo.getAbsolutePath().toString();
		String cookies = headers.getCookies().toString();
		return "Path: "+ path +" , cookies: "+ cookies;
	}
}
