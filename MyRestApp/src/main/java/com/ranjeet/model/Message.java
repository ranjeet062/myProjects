package com.ranjeet.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {

	private long id;
	private String message;
	private Date created;
	private String auther;
	
	private List<Link> links = new ArrayList<>();
	
	public Message() {
		super();
	}
	
	public Message(long id, String message, Date created, String auther) {
		super();
		this.id = id;
		this.message = message;
		this.created = created;
		this.auther = auther;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}

	public List<Link> getLinks() {
		return links;
	}

	public void setLinks(List<Link> links) {
		this.links = links;
	}
	public void addLink(String url, String rel){
		Link link = new Link();
		link.setLink(url);
		link.setRef(rel);
		links.add(link);
	}
	
}
