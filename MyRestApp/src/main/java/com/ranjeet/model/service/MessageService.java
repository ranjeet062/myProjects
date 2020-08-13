package com.ranjeet.model.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.ws.rs.QueryParam;

import com.ranjeet.database.DatabaseClass;
import com.ranjeet.exception.DataNotFoundException;
import com.ranjeet.model.Message;

public class MessageService {

	private Map<Long,Message> messages = DatabaseClass.getMessages();
	
	public MessageService(){
		messages.put(1L, new Message(1,"hello Rayansh", new Date(), "Ranjeet"));
		messages.put(2L, new Message(2,"hello Rashmi", new Date(), "Ranjeet"));
	}
	
	public List<Message> getAllMessages(){
		return new ArrayList<Message>(messages.values());
	}
	public Message getMessage(long id){
		 Message message = messages.get(id);
		 if(message == null){
			 
			 throw new DataNotFoundException("message Not found");
		 }
		 return message;
	}
	
	public Message addMessage(Message message){
		message.setId(messages.size()+1);
		message.setCreated(new Date());
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Message message){
		if(message.getId() <= 0)
		{
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message removeMessage(long id){
		return messages.remove(id);
	}
	
	public List<Message> getAllMessagesForYear(int year){
		List<Message> messageForYear = new ArrayList<>();
		Calendar cal = Calendar.getInstance();
		for (Message message : messages.values()) {
			cal.setTime(message.getCreated());
			if(cal.get(Calendar.YEAR) == year){
				messageForYear.add(message);
			}
		}
		return messageForYear;
	}
	
	public List<Message> getAllMessagesPagnated(int start, int size){
		ArrayList<Message> list = new ArrayList<Message>(messages.values());  
		return list.subList(start, size);
	}
}
