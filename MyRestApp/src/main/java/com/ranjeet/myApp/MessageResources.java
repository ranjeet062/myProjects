package com.ranjeet.myApp;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import com.ranjeet.model.Message;
import com.ranjeet.model.service.CommentResource;
import com.ranjeet.model.service.MessageService;

@Path("/messages")
public class MessageResources {

	MessageService service = new MessageService();
	
/*	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> geMessagesXml(){
		return service.getAllMessages();
	}*/
	
	/*@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> geMessages(@QueryParam("year") int year, 
									@QueryParam("start") int start,
									@QueryParam("size") int size ){
		if(year > 0 ){
			return service.getAllMessagesForYear(year);
		}
		if(start >= 0 && size >= 0){
			return service.getAllMessagesPagnated(start, size);
		}
		return service.getAllMessages();
	}*/
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getJsonMessages(@BeanParam MessageFilterBean filterBean ){
		if(filterBean.getYear() > 0 ){
			return service.getAllMessagesForYear(filterBean.getYear());
		}
		if(filterBean.getStart() >= 0 && filterBean.getSize() > 0){
			return service.getAllMessagesPagnated(filterBean.getStart() , filterBean.getSize());
		}
		return service.getAllMessages();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getXmlMessages(@BeanParam MessageFilterBean filterBean ){
		if(filterBean.getYear() > 0 ){
			return service.getAllMessagesForYear(filterBean.getYear());
		}
		if(filterBean.getStart() >= 0 && filterBean.getSize() > 0){
			return service.getAllMessagesPagnated(filterBean.getStart() , filterBean.getSize());
		}
		return service.getAllMessages();
	}
	
	/*@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_XML)
	public Message getMessage(@PathParam("messageId") long messageId){
		return service.getMessage(messageId);
	}*/
	@GET
	@Path("/{messageId}")
	@Produces(value={MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Message getMessage(@PathParam("messageId") long messageId, @Context UriInfo uriInfo){

		Message  message= service.getMessage(messageId);

		message.addLink( getUriForSelf(messageId, uriInfo), "self");
		message.addLink( getUriForProfile(messageId, uriInfo), "profile");
		
		
		return message;
	}

	
	
	/*@POST
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_XML)
	public Message addMessage(Message message){
		return service.addMessage(message);
	}*/
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addMessage(Message message, @Context UriInfo uriInfo) throws URISyntaxException{
		Message newMessage = service.addMessage(message);
		System.out.println(uriInfo.getAbsolutePath());
		String newId = String.valueOf(newMessage.getId());
		UriBuilder path = uriInfo.getAbsolutePathBuilder().path(newId);
		System.out.println(path);
		/*return Response.status(Status.CREATED)
		        .entity(newMessage)
		        .build();*/
		//return service.addMessage(message);
/*		return Response.created(new URI("myApp/webapi/messages/" + newMessage.getId()))
				       .entity(newMessage)
				       .build();*/
		return Response.created(new URI(path.toString()))
			       .entity(newMessage)
			       .build();
	}
	@POST
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_XML)
	public Response addXmlMessage(Message message, @Context UriInfo uriInfo) throws URISyntaxException{
		Message newMessage = service.addMessage(message);
		System.out.println(uriInfo.getAbsolutePath());
		String newId = String.valueOf(newMessage.getId());
		UriBuilder path = uriInfo.getAbsolutePathBuilder().path(newId);
		System.out.println(path);
		/*return Response.status(Status.CREATED)
		        .entity(newMessage)
		        .build();*/
		//return service.addMessage(message);
/*		return Response.created(new URI("myApp/webapi/messages/" + newMessage.getId()))
				       .entity(newMessage)
				       .build();*/
		return Response.created(new URI(path.toString()))
			       .entity(newMessage)
			       .build();
	}
	
	@PUT
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Message updateMessage(@PathParam("messageId") long id,Message message){
		message.setId(id);
		return service.updateMessage(message);  
	}
	
	@DELETE
	@Path("/{messageId}")
	public void deleteMessage(@PathParam("messageId") long id){
		service.removeMessage(id);
	}

	@Path("/{messageId}/comments")
	public CommentResource getCommentResource(){
		return new CommentResource();
	}
	
	
	private String getUriForSelf(long messageId, UriInfo uriInfo) {
		String uri = uriInfo.getBaseUriBuilder()
		       .path(MessageResources.class)
		       .path(Long.toString(messageId))
		       .build()
		       .toString();
		return uri;
	}
	
	private String getUriForProfile(long messageId, UriInfo uriInfo) {
		String uri = uriInfo.getBaseUriBuilder()
		       .path(ProfileResources.class)
		       .path(Long.toString(messageId))
		       .build()
		       .toString();
		return uri;
	}
}


