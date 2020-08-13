package com.ranjeet.model.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.ranjeet.model.ErrorMessage;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CommentResource {

	@GET
	public String test(){
		return "test";
	}
	
	@GET
	@Path("/{commentId}")
	public String getComment(@PathParam ("messageId") long messageId , @PathParam ("commentId") String commentId){
		ErrorMessage errorMessage = new ErrorMessage("Not Found", 404, "http://test");
		Response resp = Response.status(Status.NOT_FOUND).entity(errorMessage).build();
		
		if(messageId < 0){
			throw new WebApplicationException(resp);
		}
		if(Integer.valueOf(commentId) < 0){
			throw new NotFoundException(resp);
		}
		return "New Sub resource with commentId: "+ commentId + ", messageId: " + messageId;
	}
}
