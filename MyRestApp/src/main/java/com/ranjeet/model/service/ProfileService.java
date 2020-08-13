package com.ranjeet.model.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.ranjeet.database.DatabaseClass;
import com.ranjeet.model.Profile;

public class ProfileService {

private Map<String,Profile> profiles = DatabaseClass.getProfiles();
	
	public ProfileService(){

		profiles.put("Ranjeet", new Profile(1l, "Ranjeet", new Date(), "Ranjeet", "Gupta"));  
	}
	
	public List<Profile> getAllProfiles(){
		return new ArrayList<Profile>(profiles.values());

	}
	public Profile getProfile(String profileName){
		return profiles.get(profileName);
	}
	
	public Profile addProfile(Profile profile){
		profile.setId(profiles.size()+1);
		profile.setCreated(new Date());
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public Profile updateProfile(Profile profile){
		if(profile.getId() <= 0)
		{
			return null;
		}
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public Profile removeProfile(String profileName){
		return profiles.remove(profileName);
	}
}
