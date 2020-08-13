package com.ranjeet.myApp;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ranjeet.model.Profile;
import com.ranjeet.model.service.ProfileService;

@Path("/profiles")  
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProfileResources {

	private ProfileService service = new ProfileService();
	
	@GET
	public List<Profile> getProfile(){
		return service.getAllProfiles();
	}
	
	@POST
	public Profile addProfile(Profile profile){
		 return service.addProfile(profile);
	 }
	
	@GET
	@Path("/{profileName}")
	public Profile getProfile(@PathParam("profileName") String profileName){
		 return service.getProfile(profileName);
	 }
	
	@PUT
	@Path("/{profileName}")
	public Profile updateMessage(@PathParam("profileName") String profileName,Profile profile){
		profile.setProfileName(profileName);
		return service.updateProfile(profile);  
	}
	
	@DELETE
	@Path("/{profileName}")
	public void deleteMessage(@PathParam("profileName") String profileName){
		service.removeProfile(profileName);
	}
	
}
